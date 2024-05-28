package org.search;

import org.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSearch extends BaseTest {
    @DataProvider(name = "userData")
    public Object[][] getUserData () {
        String request = "МиКо";
        return new Object[][] {{request}};
    }

    @Test (groups = "search", dataProvider = "userData")
    public void SearchPositive(String request) {
        String expectedResult = "МиКо";

        String actualResult = MainPage.searchProduct(request).getSearchResult();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test (groups = "search")
    public void SearchNegative() {
        String incorrectRequest = "hsfhs";

        String expectedResult = "Результаты поиска (0) по \"hsfhs\"" + "\nК сожалению, на ваш поисковый запрос ничего не найдено.";

        String actualResult = MainPage.searchProduct(incorrectRequest).getNoSearchResult();

        Assert.assertEquals(expectedResult, actualResult);
    }
}
