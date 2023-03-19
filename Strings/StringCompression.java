package com.company.Strings;

public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbbbcccc";
        System.out.println(compress(str));
    }

    private static String compress(String str) {
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr = newStr + str.charAt(i);
            newStr = newStr + count.toString();
        }
        return newStr;
    }
}
