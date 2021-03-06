package com.company;

public class BubbleSort implements Sortable {

    @Override
    public void executeSort(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            for (int j = array.length - 1; j > i; --j) {
                if (array[j - 1] > array[j]) {
                    array[j - 1] = array[j - 1] + array[j] - (array[j] = array[j - 1]);
                }
            }
        }
    }
}
