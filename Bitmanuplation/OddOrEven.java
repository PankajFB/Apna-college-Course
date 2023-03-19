package com.company.Bitmanuplation;

public class OddOrEven {
    public static void main(String[] args) {
//        the LSB for a odd number is 1
//        the LSB for the even number is 0
//        we use the above logic to find the even or odd
        oddOrEven(12);
        oddOrEven(11);
        oddOrEven(18);
    }

    private static void oddOrEven(int i) {
//        we took the & of the i and the bitmask to find the LSB of the number
//        and then we used the logic written in the function
        int bitMask = 1;
        if ((i & bitMask) == 0){
            System.out.println("The number is Even");
        }else {
            System.out.println("The number is Odd");
        }
    }
}
