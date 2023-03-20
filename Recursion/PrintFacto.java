package com.company.Recursion;

public class PrintFacto {
    public static void main(String[] args) {
        System.out.println(printFact(5));
    }

    private static int printFact(int n) {
//        this is our base condition
        if (n==0 || n==1 ){
            return 1;
        }
//        this is our recursion function
//        f(n) = n * f(n-1);
       return n * printFact(n-1);
    }
}
