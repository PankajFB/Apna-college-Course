package com.company.Recursion;

public class FirstOccurence {
    public static void main(String[] args) {
        int[] array  = {1,1,22,4,5,8,22};
        System.out.println(firstOccur(array,22,0));
    }

    private static int firstOccur(int[] array, int key,int index) {
//        the time and space complexity of this algo is going to be O(n)
//        where n is the length of the array
//        base condition
        if(array[index] == key){
            return index;
        }
//        base condition
        if(index == array.length -1){
            return -1;
        }

//        recursive function
        return firstOccur(array,key,index+1);
    }
}
