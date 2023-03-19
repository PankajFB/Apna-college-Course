package com.company.Strings;

public class Palindrome {
    public static void main(String[] args) {
        String str = "racar";
        System.out.println(CheckPalindrone(str));
    }

    private static boolean CheckPalindrone(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
//                not a Palindrome
                return false;
            }

        }
        return true;
    }
}
