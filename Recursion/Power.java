package com.company.Recursion;

public class Power {
    public static void main(String[] args) {
//        we are passing the integer and the power in the function power
        System.out.println(power(5, 3));
    }

    private static int power(int num, int i) {
//          base condition
        if (i == 0){
            return 1;
        }

//        recursive function
        return num * power(num,i-1);

    }
}
