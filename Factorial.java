package com.company;

import java.util.Scanner;

public class Factorial {

    private static int factorial(int fact) {
        int ans = 1;
        for (int i = 1; i < fact; i++) {
            ans = ans * i;
        }
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int fact = f.nextInt();
        int ans = factorial(fact);
        System.out.println(ans);

    }


}
