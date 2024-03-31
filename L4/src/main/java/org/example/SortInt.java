package org.example;

public class SortInt {

    // сортировка Вставками
    public void InsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int sorted = i - 1;
            while (sorted > -1 && arr[sorted] > arr[sorted + 1]) {
                int t = arr[sorted];
                arr[sorted] = arr[sorted + 1];
                arr[sorted + 1] = t;
                sorted--;
            }
        }
    }


    // сортировка Расческой
    public void CombSort (int arr[]) {
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
                    int t = arr[i];
                    arr[i] = arr[i - gap];
                    arr[i - gap] = t;
                    isSorted = false;
                }
            }
        }
    }


    // сортировка Выбором
    public void SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }
            if (min_index != i) {
                int t = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = t;
            }
        }
    }


    // Быстрая сортировка (Хоара)
    public int HoareSort(int arr[], int left, int right) {
        int pivot = arr[(left+right) / 2]; // обозначаем опорный элемент (середина массива)

        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }

            if (left <= right) {
                int t = arr[left];
                arr[left] = arr[right];
                arr[right] = t;
                left++;
                right--;
            }
        }
        return left;
    }

    void quickHoareSort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }

        int rightStart = HoareSort(arr, start, end);
        quickHoareSort(arr, start, rightStart-1);
        quickHoareSort(arr, rightStart, end);
    }

    void quickHoareSort(int arr[]) {
        quickHoareSort(arr, 0, arr.length - 1);
    }
}

