package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SortTestPositive {

    @Test(groups = "positive")
    void testInsertionSort() {

        // Arrange
        SortInt sort = new SortInt();
        int Arr[] = {1, 15, 2, 61, 8, 70};
        int expectedArr[] = {1, 2, 8, 15, 61, 70};


        // Act
        sort.insertionSort(Arr);

        // Accert
        Assert.assertEquals(expectedArr, Arr);
    }

    @Test(groups = "positive")
    void testCombSort() {

        // Arrange
        SortInt sort = new SortInt();
        int Arr[] = {1, 15, 2, 61, 8, 70};
        int expectedArr[] = {1, 2, 8, 15, 61, 70};

        // Act
        sort.combSort(Arr);

        // Accert
        Assert.assertEquals(expectedArr, Arr);
    }

    @Test(groups = "positive")
    void testSelectionSort() {

        // Arrange
        SortInt sort = new SortInt();
        int Arr[] = {1, 15, 2, 61, 8, 70};
        int expectedArr[] = {1, 2, 8, 15, 61, 70};

        // Act
        sort.selectionSort(Arr);

        // Accert
        Assert.assertEquals(expectedArr, Arr);
    }

    @Test(groups = "positive")
    void testQuickHoareSort() {

        // Arrange - окружение
        SortInt sort = new SortInt();
        int Arr[] = {1, 15, 2, 61, 8, 70};
        int expectedArr[] = {1, 2, 8, 15, 61, 70};

        // Act - действие
        sort.quickHoareSort(Arr);

        // Accert - сравнение
        Assert.assertEquals(expectedArr, Arr);
    }

    @Test(groups = "positive")
    void testInsertionSortDouble() {
        SortDouble sort = new SortDouble();
        double Arr[] = {1.15, 15.8, 2, 61.9, 8.71, 70.5};
        double expectedArr[] = {1.15, 2, 8.71, 15.8, 61.9, 70.5};

        sort.insertionSortDouble(Arr);

        Assert.assertEquals(expectedArr, Arr);
    }

    @Test(groups = "positive")
    void testCombSortDouble() {
        SortDouble sort = new SortDouble();
        double Arr[] = {1.15, 15.8, 2, 61.9, 8.71, 70.5};
        double expectedArr[] = {1.15, 2, 8.71, 15.8, 61.9, 70.5};

        sort.combSortDouble(Arr);

        Assert.assertEquals(expectedArr, Arr);
    }

    @Test(groups = "positive")
    void testSelectionSortDouble() {
        SortDouble sort = new SortDouble();
        double Arr[] = {1.15, 15.8, 2, 61.9, 8.71, 70.5};
        double expectedArr[] = {1.15, 2, 8.71, 15.8, 61.9, 70.5};

        sort.selectionSortDouble(Arr);

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
