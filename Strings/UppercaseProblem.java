package com.company.Strings;

public class UppercaseProblem {
    public static void main(String[] args) {
       String str = "hi i am pankaj kumar ";
        System.out.println(toUpperCase(str));

    }

    private static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

//        append the first letter of the str
        sb.append(Character.toUpperCase(str.charAt(0)));

//        for rest of the str
        for (int i = 1; i < str.length() ; i++) {
//            we are using the condition i<str.length() - 1
//            bcos it will check the for the ' ' at the end of the str
//            and if we don't use this condition it will give the index out of bound error

            if (str.charAt(i) == ' ' && i < str.length() - 1 ){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
