package com.company.Sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] array = {5,4,6,8,4,2,6,5,1,2,1,2,3,6,5};
        System.out.println(Arrays.toString(Counting_sort(array)));
    }

    private static int[] Counting_sort(int[] array) {
        
        int largest = Integer.MIN_VALUE;
//        for storing the largest value inside the aray
        for (int i = 0; i < array.length; i++) {
            largest = Math.max(largest,array[i]);
        }
        
//        For storing the count of each elements in the count array
        int[] count = new int[largest+1];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        
//       Sorting part
        int j = 0;
        for (int i = 0; i < count.length; i++) {
           while (count[i] > 0){
               array[j] = i;
               j++;
               count[i]--;
           }
            
        }
        return array;
    }

}
