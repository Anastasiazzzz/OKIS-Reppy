package org.example;

public class SortDouble {

    public void insertionSortDouble(double arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int sorted = i - 1;
            while (sorted > -1 && arr[sorted] > arr[sorted + 1]) {
                double t = arr[sorted];
                arr[sorted] = arr[sorted + 1];
                arr[sorted + 1] = t;
                sorted--;
            }
        }
    }


    public void combSortDouble(double arr[]) {
        int gap = arr.length;

        boolean isSorted = false;
        while (!isSorted || gap != 1) {

            if (gap > 1) {
                gap = gap * 10 / 13; // получаем точный шаг сравнения в целых числах
            }
            else {
                gap = 1;
            }

            isSorted = true;
            for (int i = gap; i < arr.length; i++) {
                if (arr[i - gap] > arr[i]) {
                    double t = arr[i];
                    arr[i] = arr[i - gap];
                    arr[i - gap] = t;
                    isSorted = false;
                }
            }
        }
    }


    public void selectionSortDouble(double arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }
            if (min_index != i) {
                double t = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = t;
            }
        }
    }


    public int hoareSortDouble(double arr[], int left, int right) {
        double pivot = arr[(left+right) / 2]; // обозначаем опорный элемент (середина массива)

        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }

            if (left <= right) {
                double t = arr[left];
                arr[left] = arr[right];
                arr[right] = t;
                left++;
                right--;
            }
        }
        return left;
    }

    void quickHoareSortDouble(double arr[], int start, int end) {

        if (start >= end) {
            return;
        }

        int rightStart = hoareSortDouble(arr, start, end);
        quickHoareSortDouble(arr, start, rightStart-1);
        quickHoareSortDouble(arr, rightStart, end);
    }

    void quickHoareSortDouble(double arr[]) {
        quickHoareSortDouble(arr, 0, arr.length - 1);
    }
}
