package com.company.Recursion;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 20, 4, 5, 6, 30};
//        we called the isSorted function and we passed the array and the starting index
        System.out.println(isSorted(arr,0));
    }

    private static boolean isSorted(int[] arr, int i) {
//        the  time and space somplexity for our algo is going to be O(n)
//        where n is the length of array
//        for the the index
        if(i == arr.length-1){
            return true;
        }

//        will return false if any of the previous element is bigger
        if(arr[i] > arr[i+1]){
            return false;
        }

//        this is our recursion call
        return isSorted(arr,i+1);
    }
}
