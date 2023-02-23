package com.company;

public class SkipAChar {
    public static void main(String[] args) {
        System.out.println(skipStrApple("bacfaapplesfdfappleaaacad"));
    }

    private static String skipStrApple( String up) {
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);

        if(up.startsWith("apple")){
            return skipStrApple(up.substring(5));
        }
        else {
            return ch + skipStrApple(up.substring(1));
        }
    }

}
