package com.company.Arrays;

public class Max_subarray {
    public static void main(String[] args) {
        int  arr[] = {2,4,6,8,10};
        printSubarrays(arr);
    }

    private static void printSubarrays(int[] arr) {
        int totalSubarray = 0;
        int maxsub = 0;
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k]+" ");
                    totalSubarray++;
                    sum = sum + arr[k];
                }
                System.out.println();
                if (maxsub < sum ){
                    maxsub = sum;
                }
            }
            System.out.println();
        }
        System.out.println("The total number of sub arrays is : "+ totalSubarray);
        System.out.println("The max subarray is : " + maxsub);
    }
}
