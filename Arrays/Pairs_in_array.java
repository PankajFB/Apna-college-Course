package com.company.Arrays;

public class Pairs_in_array {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5};
        makePairs(arr);
    }

    private static void makePairs(int[] arr) {
        int TotalPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                System.out.print("("+arr[i]+","+arr[j]+")");
                TotalPairs++;
            }
            System.out.println();
        }
        System.out.println("The total number of pairs will be : " + TotalPairs);
    }
}
