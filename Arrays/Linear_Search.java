package com.company.Arrays;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {1, 22, 38, 4, 15, 16, 7, 81, 9, 10};
        int target = 9;
        System.out.println(linearSearch(arr, target));
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
