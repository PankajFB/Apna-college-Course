package com.company.Recursion;

public class FriendsPasiring {
    public static void main(String[] args) {
        System.out.println(friendPair(5));
    }

    private static int friendPair(int n) {
//        base case
        if (n == 1 || n == 2){
            return n;
        }

//        total number of ways
//        the first term is for the single case and the other is for pair case
        return friendPair(n-1) + (n-1)*friendPair(n-2);
    }
}
