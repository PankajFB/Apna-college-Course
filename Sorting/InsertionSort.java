package com.company.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] array = {5, 4, 6, 8, 47, 1, 5, 9, 6, 1, 6};
        System.out.println(Arrays.toString(insertionSort(array)));
    }

    private static int[] insertionSort(int[] array) {
        for (int i = 3; i < array.length; i++) {

            for (int j = i + 1; j >= 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }


        }
        return array;
    }
}
