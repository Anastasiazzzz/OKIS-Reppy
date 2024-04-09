package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SortTestPositive {

    @Test(groups = "positive")
    void testInsertionSort() {
        SortInt sort = new SortInt();
        int Arr[] = {1, 15, 2, 61, 8, 70};

        sort.insertionSort(Arr);

        int expectedArr[] = {1, 2, 8, 15, 61, 70};
        Assert.assertEquals(expectedArr, Arr);
    }

    @Test(groups = "positive")
    void testCombSort() {
        SortInt sort = new SortInt();
        int Arr[] = {1, 15, 2, 61, 8, 70};

        sort.combSort(Arr);

        int expectedArr[] = {1, 2, 8, 15, 61, 70};
        Assert.assertEquals(expectedArr, Arr);
    }

    @Test(groups = "positive")
    void testSelectionSort() {
        SortInt sort = new SortInt();
        int Arr[] = {1, 15, 2, 61, 8, 70};

        sort.selectionSort(Arr);

        int expectedArr[] = {1, 2, 8, 15, 61, 70};
        Assert.assertEquals(expectedArr, Arr);
    }

    @Test(groups = "positive")
    void testQuickHoareSort() {

        // Arrange
        SortInt sort = new SortInt();
        int Arr[] = {1, 15, 2, 61, 8, 70};
        int expectedArr[] = {1, 2, 8, 15, 61, 70};

        //Act
        sort.quickHoareSort(Arr);

        // Accert
        Assert.assertEquals(expectedArr, Arr);
    }

    @Test(groups = "positive")
    void testInsertionSortDouble() {
        SortDouble sort = new SortDouble();
        double Arr[] = {1.15, 15.8, 2, 61.9, 8.71, 70.5};

        sort.insertionSortDouble(Arr);

        double expectedArr[] = {1.15, 2, 8.71, 15.8, 61.9, 70.5};
        Assert.assertEquals(expectedArr, Arr);
    }

    @Test(groups = "positive")
    void testCombSortDouble() {
        SortDouble sort = new SortDouble();
        double Arr[] = {1.15, 15.8, 2, 61.9, 8.71, 70.5};

        sort.combSortDouble(Arr);

        double expectedArr[] = {1.15, 2, 8.71, 15.8, 61.9, 70.5};
        Assert.assertEquals(expectedArr, Arr);
    }

    @Test(groups = "positive")
    void testSelectionSortDouble() {
        SortDouble sort = new SortDouble();
        double Arr[] = {1.15, 15.8, 2, 61.9, 8.71, 70.5};

        sort.selectionSortDouble(Arr);

        double expectedArr[] = {1.15, 2, 8.71, 15.8, 61.9, 70.5};
        Assert.assertEquals(expectedArr, Arr);
    }

    @Test(groups = "positive")
    void testQuickHoareSortDouble() {
        SortDouble sort = new SortDouble();
        double Arr[] = {1.15, 15.8, 2, 61.9, 8.71, 70.5};
        double expectedArr[] = {1.15, 2, 8.71, 15.8, 61.9, 70.5};

        sort.quickHoareSortDouble(Arr);

        Assert.assertEquals(expectedArr, Arr);
    }
}
