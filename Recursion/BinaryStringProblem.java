package com.company.Recursion;

public class BinaryStringProblem {
    public static void main(String[] args) {
//        our problem is
//        Print all the binary strings of size N without consecutive ones

        printBinaryStrings(3,0,"");
    }

    private static void printBinaryStrings(int n, int lastplace, String str) {
//        base case
        if (n == 0){
            System.out.println(str);
            return;
        }

//        work

//        default insert in our string
        printBinaryStrings(n-1,0,str+"0");
//        if the last char in the string is 0
        if (lastplace == 0){
            printBinaryStrings(n-1,1,str+"1");
        }

    }
}
