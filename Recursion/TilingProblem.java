package com.company.Recursion;

public class TilingProblem {
    public static void main(String[] args) {
//        we are taking a for width of 2 only and we are passing the length to the function
        System.out.println(tilingProblem(3));
    }

    private static int tilingProblem(int i) {
//        base case if we take length of 1 or 0 we take no of ways is 1 only
        if(i == 0 || i == 1){
            return 1;
        }

//        for vertical choice
//        here we are using one tile of size 2*1
        int fnm1 = tilingProblem(i-1);

//        for horizontal choice
//        here we are using two tiles placed horizontally of size 2*1 covering area 2*2
        int fnm2 = tilingProblem(i-2);

//        we are returning total no of ways
        return  fnm1 + fnm2;

    }
}
