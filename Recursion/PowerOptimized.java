package com.company.Recursion;

public class PowerOptimized {
    public static void main(String[] args) {
        System.out.println(powerOptimized(5,3));
    }

    private static int powerOptimized(int num, int i) {
//        base case
        if (i==0){
            return 1;
        }

//        half power optimized one
//        2^5 = 2 * 2^2 * 2^2   for odd power
//        2^4 =  2^2 * 2^2   for even power
        int halfPower = powerOptimized(num,i/2);
        int halfPowerSqr = halfPower * halfPower;

        if (i%2 != 0){
            halfPowerSqr = num * halfPowerSqr;
        }
        return halfPowerSqr;
    }
}
