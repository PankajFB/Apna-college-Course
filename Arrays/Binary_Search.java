package com.company.Arrays;

public class Binary_Search {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int target = 4;
        System.out.println(binarySearch(arr, target));
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        for (int i = start; i <= end; i++) {
           int mid = (start + end) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            }
             else end = mid - 1;
        }
        return -1;

    }
}

