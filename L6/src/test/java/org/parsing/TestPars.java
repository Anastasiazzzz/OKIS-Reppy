package org.parsing;

import org.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPars extends BaseTest {
    @Test (groups = "pars")
    void Title() {
        String expectedResult = "ПОИСК\n" + "НАПИСАТЬ ОТЗЫВ\n" + "Вход";

        String actualResult = MainPage.Title();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test (groups = "pars")
    void Section() {
        String expectedResult = "Подбираем косметику для лица\n" + "Нормальная\n" + "Комбинированная\n" + "Сухая\n" + "Жирная";

        String actualResult = MainPage.Section();

        Assert.assertEquals(expectedResult, actualResult);
    }
}
