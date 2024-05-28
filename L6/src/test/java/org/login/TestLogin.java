package org.login;

import org.baseTest.BaseTest;
import org.page.MainPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestLogin extends BaseTest {
    @DataProvider(name = "userData")
    public Object[][] getUserData () {
        String username = "nebosovk@mail.ru";
        String password = "c10968";
        return new Object[][] {{username, password}};
    }

    @Test (groups = "login", dataProvider = "userData")
    void loginPositive(String username, String password) throws MainPage.AuthenticationException {
        String expectedResult = "Kulich";

        String actualResult = MainPage.loginUser(username, password).getProfileName();

        Assert.assertEquals(actualResult, expectedResult);
    }

    // изменение строки
    private static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    @Test (groups = "login", dataProvider = "userData", expectedExceptions = {MainPage.AuthenticationException.class})
    void loginNegativeIncorrectUsername (String username, String password) throws MainPage.AuthenticationException {
        String incorrectUsername = reverseString(username);
        MainPage.loginUser(incorrectUsername, password);
    }

    @Test (groups = "login", dataProvider = "userData", expectedExceptions = {MainPage.AuthenticationException.class})
    void loginNegativeIncorrectPassword (String username, String password) throws MainPage.AuthenticationException {
        String incorrectPassword = reverseString(password);
        MainPage.loginUser(username, incorrectPassword);
    }

    @Test (groups = "login", dataProvider = "userData", expectedExceptions = {MainPage.AuthenticationException.class})
    void exit(String username, String password) throws MainPage.AuthenticationException {
        MainPage.exit();
    }
}