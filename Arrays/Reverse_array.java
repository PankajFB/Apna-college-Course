package com.company.Arrays;

import java.util.Arrays;

public class Reverse_array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int reverse[] = reverseArray(arr);
        System.out.println(Arrays.toString(reverse));
    }

    private static int[] reverseArray(int[] arr) {

        int first = 0, last = arr.length - 1;
        for (first = 0; first < last; first++) {
        //            swap
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
         // updater of last
            last--;

        }
        return arr;
    }
}
