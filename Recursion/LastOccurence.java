package com.company.Recursion;

public class LastOccurence {
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 6, 4, 1, 8};
        System.out.println(lastOccurence(array, 1, 0));
    }

    private static int lastOccurence(int[] array, int key, int index) {
//        the time and space complexity for this algo is the O(n)

//        case if never found out key in the entire array
        if (index == array.length - 1) {
            return -1;
        }

//        it will check for the key in forward array
        int isFound = lastOccurence(array, key, index + 1);

//        this is the case if never got a key again in the array
//        it will return the last when it occured
        if (isFound == -1 && array[index] == key) {
            return index;
        }
        return isFound;
    }
}
