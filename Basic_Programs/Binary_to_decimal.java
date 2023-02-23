package com.company.Basic_Programs;

public class Binary_to_decimal {
    public static void main(String[] args) {
        biToDec(10111);
    }

    private static void biToDec(int binarynumber) {
        int ourBinaryNumber = binarynumber;

        int power = 0;
        int dec = 0;
       while (binarynumber > 0){
           int lastDigit = binarynumber%10;
           dec = dec + lastDigit*((int)Math.pow(2,power));
           binarynumber = binarynumber/10;
           power++;
       }
        System.out.println( +ourBinaryNumber + " in decimal is : " +dec);
    }
}
