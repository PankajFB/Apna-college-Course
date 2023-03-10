package com.company;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 8, 7, 9, 2, 4, 44};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int hi) {
        if (low >= hi) {
            return;
        }
        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = arr[m];

        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
//        now my pivot is at the correct position and now sort the remainin twp halves now
        quickSort(arr, low, e);
        quickSort(arr, s, hi);
    }
}
