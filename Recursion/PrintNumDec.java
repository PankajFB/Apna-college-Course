package com.company.Recursion;

public class PrintNumDec {
    public static void main(String[] args) {
        printNum(10);

    }

    private static void printNum(int n) {
//        base condition
        if (n == 1){
            System.out.println(n);
            return;
        }
//    word
        System.out.print(n + " ");

//        recurring function
        printNum(n-1);
    }
}
