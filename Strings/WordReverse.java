package com.company.Strings;

public class WordReverse {
    public static void main(String[] args) {

        String str = "I am Pankaj Kumar";
        System.out.println(reverse(str));
    }

    private static String  reverse(String str) {
//        The complexity of our algo is only O(n) or its linear time complexity

//        for the new string
        String newstr = "";

//        for storing the word we declared it as StringBuilder bcos we have to perform the reverse operation
//        and its prebuilt in the StringBuilder class and not in the String class
        StringBuilder word = new StringBuilder("");

//        for iteration of the every chat in the string
        for (int i = 0; i < str.length(); i++) {
//            here we check for space in the String
            if (str.charAt(i) == ' ' ){
                newstr = newstr + word.reverse() + " " ;
                word.setLength(0);
            }
//            this is for the last word in the String
//            we manually appended the last word in our final string
            else if (i == str.length()-1 ){
                word.append(str.charAt(i));
                newstr = newstr + word.reverse() ;
            }
//            for storing the word
            else {
                word.append(str.charAt(i));
            }
        }
return newstr;
    }
}
