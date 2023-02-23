package com.company.Basic_Programs;

public class Decimal_to_binary {
    public static void main(String[] args) {
        decToBin(7);
    }

    private static void decToBin(int number) {
        int num = number;
        int pow = 0;
        int binNum = 0;
        while(number > 0){
            int rem = number%2;
            binNum = binNum + rem*(int)Math.pow(10,pow);
            pow++;
            number = number/2;
        }
        System.out.println(binNum);
    }
}
