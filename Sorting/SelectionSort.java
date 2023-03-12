package com.company.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {5, 4, 6, 8, 47, 1, 5, 9, 6, 1, 6};
        System.out.println(Arrays.toString(selectionSort(array)));
    }

    private static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < array.length; j++) {
//                In this loop what we have done is we looked for the smallest
//                element in the entire array and stored so that we can swap it
//                for arranging the elements in the decreasing order just change the operator in the if condition
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
            }
//            we will swap after finding the smallest element in the array
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
