package org.page;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.constants.Constants.ExpectationVariable.*;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)); // объявление переменной, отвечающей за ожидание


    // реализация входа в аккаунт
    private final By loginInBy = By.cssSelector("a.page-header__enter-button");
    private final By inputNameBy = By.cssSelector("input#login-email.text-input");
    private final By inputPassBy = By.cssSelector("input#login-passwd.text-input");
    private final By buttonLoginBy = By.xpath("//button[@value='Войти']");

    public MainPage loginUser(String username, String password) throws AuthenticationException {

        wait.until(ExpectedConditions.visibilityOfElementLocated(loginInBy)).click();
        // changeFrame(iFrameLogInBy);

        driver.findElement(inputNameBy).sendKeys(username);
        driver.findElement(inputPassBy).sendKeys(password);
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonLoginBy)).click();

        incorrectLogin();

        return new MainPage(driver);
    }

    // получение имени пользователя
    private final By buttonProfileBy = By.cssSelector("a.user-toggle");
    private final By profileNameBy = By.cssSelector("div.user-dropdown__user-name");

    public String getProfileName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonProfileBy)).click();
        return driver.findElement(profileNameBy).getAttribute("innerText");
    }

    // вход с неверными данными
    private final By incorrectLoginBy = By.xpath("//div[@class='_error'][@style='display: block;']");

    private MainPage incorrectLogin() throws AuthenticationException {
        try {
            if (wait.until(ExpectedConditions.presenceOfElementLocated(incorrectLoginBy)).isDisplayed()) {
                throw new AuthenticationException("Неверный логин или пароль");
            }
        } catch (TimeoutException e) {}

        return new MainPage(driver);
    }

    // выход из аккаунта
    private final By userIconBy = By.xpath("//a[@class='user-toggle ']");
    private final By buttonExitBy = By.xpath("//a[@href='/?logout=yes']");

    public MainPage exit() throws AuthenticationException {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(userIconBy)).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(buttonExitBy)).click();
        } catch (TimeoutException e) {
            throw new AuthenticationException("Вход в аккаунт не выполнен");
        }

        return new MainPage(driver);
    }

    public static class AuthenticationException extends Exception {
        public AuthenticationException(String message) {
            super(message);
        }
    }


    // поиск заголовка сайта
    private final By titleBy = By.xpath("//div[@class='page-header__top-row']");

    public String Title() {
        List<WebElement> title = driver.findElements(titleBy);
        return title.get(0).getAttribute("innerText");
    }


    // раздел сайта и его элементы
    private final By sectionLinkBy = By.cssSelector("a[href=\"/kosmetika_dlya_litsa/\"]:nth-of-type(1)");
    private final By sectionBy = By.xpath("//h1 [@class='h1-small']");
    private final By elem_1By = By.xpath("//label[@for='rad1']");
    private final By elem_2By = By.xpath("//label[@for='rad2']");
    private final By elem_3By = By.xpath("//label[@for='rad3']");
    private final By elem_4By = By.xpath("//label[@for='rad4']");

    public String Section() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(sectionLinkBy)).click();
        List<WebElement> section = driver.findElements(sectionBy);
        List<WebElement> elem_1 = driver.findElements(elem_1By);
        List<WebElement> elem_2 = driver.findElements(elem_2By);
        List<WebElement> elem_3 = driver.findElements(elem_3By);
        List<WebElement> elem_4 = driver.findElements(elem_4By);

        return (section.get(0).getAttribute("innerText") + "\n" + elem_1.get(0).getAttribute("innerText"))
                + "\n"+ elem_2.get(0).getAttribute("innerText") + "\n"+ elem_3.get(0).getAttribute("innerText")
                + "\n" +  elem_4.get(0).getAttribute("innerText");
    }


    // поиск по каталогу сайта
    private final By searchMenuBy = By.xpath("//a[@class='page-header__control-item'][1]");
    private final By searchInputBy = By.cssSelector("input#search_field.text-input");
    private final By searchButtonBy = By.cssSelector("button.search-button");
    private final By searchResultBy = By.xpath("//a[@href='/brand/miko/'][b]");

    public MainPage searchProduct(String request) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(searchMenuBy)).click();
        driver.findElement(searchInputBy).sendKeys(request);
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchButtonBy)).click();

        return new MainPage(driver);
    }

    // получение результата с верным названием
    public String getSearchResult() {
        return driver.findElement(searchResultBy).getAttribute("innerText");
    }


    // получение результата с неверным названием
    private final By searchNoResultBy = By.xpath("//div[@class='search-page clearfix']");

    public String getNoSearchResult() {
        return driver.findElement(searchNoResultBy).getAttribute("innerText");
    }
}
