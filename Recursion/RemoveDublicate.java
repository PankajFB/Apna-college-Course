package com.company.Recursion;

public class RemoveDublicate {
    public static void main(String[] args) {
        String str = "aaabbbbbccchhhhhddsfsdfzs";
        System.out.println(removeDublicate(str, 0, new StringBuilder(""), new boolean[26]));
    }

    private static StringBuilder removeDublicate(String str, int index, StringBuilder newstr, boolean[] map) {
//        base condition
        if (index == str.length()){
            return newstr;
        }

//        work
//        here what we are doing is we have taken a array of boolean type and of size 26
//        in which by default false is stored
        char currChar = str.charAt(index);
        if (map[currChar - 'a']){
            removeDublicate(str,index+1,newstr,map);
        }
        else {
            map[currChar - 'a'] = true;
            removeDublicate(str,index+1,newstr.append(currChar),map);
        }

        return newstr;

    }
}
