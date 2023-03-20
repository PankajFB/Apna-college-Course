package com.company.Recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(calFibonacci(45));
    }

    private static int calFibonacci(int num) {
//        this is our base condition
//        the first two elements are the 0 and 1
        if (num == 0 || num == 1) {
            return num;
        }
//        this is our recursive function
//        in simple lang fibo(n) = fibo(n-1) + fibo(n-2)
//        or simply we can say that the sum of the previous two terms
        return calFibonacci(num - 1) + calFibonacci(num - 2);

    }
}
