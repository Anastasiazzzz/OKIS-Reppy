package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SortTestNegative {

    @Test(groups = "negative")
    void testQuickHoareSort() {

        // Arrange
        SortInt sort = new SortInt();
        int Arr[] = {1, 15, 2, 61, 8, 70};
        int expectedArr[] = {1, 15, 2, 61, 8, 70};

        //Act
        sort.hoareSort(Arr, Arr.length, Arr.length - 1);

        // Accert
        Assert.assertEquals(expectedArr, Arr);
    }

    @Test(groups = "negative")
    void testQuickHoareSortDouble() {

        SortDouble sort = new SortDouble();
        double Arr[] = {1.15, 15.8, 2, 61.9, 8.71, 70.5};
        double expectedArr[] = {1.15, 15.8, 2, 61.9, 8.71, 70.5};

        sort.hoareSortDouble(Arr, Arr.length, Arr.length - 1);

        Assert.assertEquals(expectedArr, Arr);
    }
}
