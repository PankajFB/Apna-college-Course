package com.company.Basic_Programs;

import java.util.Scanner;

public class Prime_or_not {
    public static void main(String[] args) {
        System.out.println(Prime_check(8));
    }

    private static boolean Prime_check(int num) {
        if(num == 2){
            return true;
        }
        for (int i = 2; i <= Math.sqrt((num)); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
