package com.company;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        ArrayList<String> list = subSeq("","abc",new ArrayList<String>());
        System.out.println(list);
    }
    private static ArrayList<String> subSeq(String p, String up,ArrayList<String> list) {
        if(up.length()==0){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        subSeq(p,up.substring(1),list);
        subSeq(p+ch,up.substring(1),list);
return list;
    }
}
