package com.company.Patterns;

public class Butterfly_Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= (2*4) - (2*i); j++) {
                System.out.print("  ");
            }
            for (int j = 1 ; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int i = 1; i <=4; i++) {
            for (int j = 0; j <= 4-i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j <= (2*i-3); j++) {
                System.out.print("  ");
            }
            for (int j = 0 ; j <= 4-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
