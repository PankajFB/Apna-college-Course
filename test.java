package com.company;

public class test {
    public static void main(String[] args) {
        String s="BGBBG";
        char c[]=s.toCharArray();
        int start = 0;
        int end  = s.length()-1;

        while(start<end){
            if(c[start]=='B' && c[end]=='G'){
                char temp = c[start];
                c[start] = c[end];
                c[end] = temp;
                start++;
                end--;
            }
            else if(c[start]=='B' && c[end]=='B'){
                end--;
            }
            else {
                start++;
                end--;
            }
            System.out.println(c);
    }
}
}
