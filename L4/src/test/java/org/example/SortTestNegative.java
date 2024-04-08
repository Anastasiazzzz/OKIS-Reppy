package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SortTestNegative {

    @Test(groups = "negative")
    void testQuickHoareSort() {
        SortInt sort = new SortInt();

        int Arr[] = {1, 15, 2, 61, 8, 70};

        sort.hoareSort(Arr, Arr.length, Arr.length - 1);

        int expectedArr[] = {1, 15, 2, 61, 8, 70};
        Assert.assertEquals(expectedArr, Arr);
    }

    @Test(groups = "negative")
    void testQuickHoareSortDouble() {

        SortDouble sort = new SortDouble();

        double Arr[] = {1.15, 15.8, 2, 61.9, 8.71, 70.5};

        sort.hoareSortDouble(Arr, Arr.length, Arr.length - 1);

        double expectedArr[] = {1.15, 15.8, 2, 61.9, 8.71, 70.5};
        Assert.assertEquals(expectedArr, Arr);
    }
}
