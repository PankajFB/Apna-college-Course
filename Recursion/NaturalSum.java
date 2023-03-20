package com.company.Recursion;

public class NaturalSum {
    public static void main(String[] args) {
        System.out.println(calNaturalSum(5));
    }

    private static int calNaturalSum(int num) {
        if(num==1){
            return 1;
        }
        return num + calNaturalSum(num-1);
    }
}
