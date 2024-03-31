package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SortTestNegative {

    @Test(groups = "negative")
    void testInsertionSort() {
        SortInt sort = new SortInt();
        int Arr[] = {1, 15, 2, 61, 8, 70};

        sort.InsertionSort(Arr);

        int expectedArr[] = {1, 8, 15, 2, 61, 70};
        Assert.assertEquals(expectedArr, Arr);
    }

    @Test(groups = "negative")
    void testCombSort() {
        SortInt sort = new SortInt();
        int Arr[] = {1, 15, 2, 61, 8, 70};

        sort.CombSort(Arr);

        int expectedArr[] = {1, 8, 15, 2, 61, 70};
        Assert.assertEquals(expectedArr, Arr);
    }

    @Test(groups = "negative")
    void testSelectionSort() {
        SortInt sort = new SortInt();
        int Arr[] = {1, 15, 2, 61, 8, 70};

        sort.SelectionSort(Arr);

        int expectedArr[] = {1, 8, 15, 2, 61, 70};
        Assert.assertEquals(expectedArr, Arr);
    }

    @Test(groups = "negative")
    void testQuickHoareSort() {
        SortInt sort = new SortInt();

        int Arr[] = {1, 15, 2, 61, 8, 70};

        sort.quickHoareSort(Arr);

        int expectedArr[] = {1, 8, 15, 2, 61, 70};
        Assert.assertEquals(expectedArr, Arr);
    }

    @Test(groups = "negative")
    void testInsertionSortDouble() {
        SortDouble sort = new SortDouble();
        double Arr[] = {1.15, 15.8, 2, 61.9, 8.71, 70.5};

        sort.InsertionSortDouble(Arr);

        double expectedArr[] = {1.15, 8.71, 2, 61.9, 15.8, 70.5};
        Assert.assertEquals(expectedArr, Arr);
    }

    @Test(groups = "negative")
    void testCombSortDouble() {
        SortDouble sort = new SortDouble();
        double Arr[] = {1.15, 15.8, 2, 61.9, 8.71, 70.5};

        sort.CombSortDouble(Arr);

        double expectedArr[] = {1.15, 8.71, 2, 61.9, 15.8, 70.5};
        Assert.assertEquals(expectedArr, Arr);
    }

    @Test(groups = "negative")
    void testSelectionSortDouble() {
        SortDouble sort = new SortDouble();
        double Arr[] = {1.15, 15.8, 2, 61.9, 8.71, 70.5};

        sort.SelectionSortDouble(Arr);

        double expectedArr[] = {1.15, 8.71, 2, 61.9, 15.8, 70.5};
        Assert.assertEquals(expectedArr, Arr);
    }

    @Test(groups = "negative")
    void testQuickHoareSortDouble() {
        SortDouble sort = new SortDouble();

        double Arr[] = {1.15, 15.8, 2, 61.9, 8.71, 70.5};

        sort.quickHoareSortDouble(Arr);

        double expectedArr[] = {1.15, 8.71, 2, 61.9, 15.8, 70.5};
        Assert.assertEquals(expectedArr, Arr);
    }
}
