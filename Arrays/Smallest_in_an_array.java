package com.company.Arrays;

public class Smallest_in_an_array {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, -55, 6, 77, 8, 9, 10};
        System.out.println(smallest(arr));
    }

    static int smallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
