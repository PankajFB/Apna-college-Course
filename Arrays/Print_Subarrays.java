package com.company.Arrays;

public class Print_Subarrays {
    public static void main(String[] args) {
        int  arr[] = {2,4,6,8,10};
        printSubarrays(arr);
    }

    private static void printSubarrays(int[] arr) {
        int totalSubarray = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+" ");
                    totalSubarray++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The total number of sub arrays is : "+ totalSubarray);
    }
}
