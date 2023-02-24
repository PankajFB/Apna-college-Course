package com.company.Patterns;

public class Zero_and_One_Triangle {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                if ((i+j) % 2 == 0) {
                    System.out.print("1");
                } else System.out.print("0");

            }
            System.out.println();

        }
    }
}
