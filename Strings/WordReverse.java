package com.company.Strings;

public class WordReverse {
    public static void main(String[] args) {
        String str = "why soo serious";
        System.out.println(reverse(str));
    }

    private static String  reverse(String str) {
        String newstr = "";
        StringBuilder word = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' ){
                newstr = newstr + word.reverse() + " " ;
                word.setLength(0);
            }else if (i == str.length()-1 ){
                word.append(str.charAt(i));
                newstr = newstr + word.reverse() ;

            }
            else {
                word.append(str.charAt(i));
            }
        }
return newstr;
    }
}
