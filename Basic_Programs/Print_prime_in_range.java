package com.company.Basic_Programs;

public class Print_prime_in_range {

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

    public static void main(String[] args) {
        System.out.println("the prime numbers are");
        for (int i = 0; i <  102; i++) {
            if(Prime_check(i)){
                System.out.println(i);
            }
        }

    }
}
