package com.company.Bitmanuplation;

public class BitOperation {
    public static void main(String[] args) {
//        we are giving two parameters in the function the first one is going
//        to the number itsself and other is the Ith bit from the end
        System.out.println(getTheIthBit(10,3));
    }

    private static int getTheIthBit(int num, int i) {
        int bitmask = num>>i;
        if ((bitmask & 1) ==0){
            return 0;
        }
        else {
            return 1;
        }
    }
}
