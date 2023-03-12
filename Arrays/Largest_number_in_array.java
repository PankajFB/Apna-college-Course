package com.company.Arrays;

public class Largest_number_in_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 6, 77, 8, 9, 10};
        System.out.println(largest(arr));
    }

    static int largest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        System.out.println(largest);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
