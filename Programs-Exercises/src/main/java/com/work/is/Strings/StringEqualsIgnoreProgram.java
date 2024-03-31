package com.work.is.Strings;

public class StringEqualsIgnoreProgram {

    public static void main(String[] args){

        //equalsIgnoreCase
        String str1 = "hEllo";
        String str2 = "hELlO";
        System.out.println(str1.equalsIgnoreCase(str2));

        //toUpperCase
        System.out.println(str1.toUpperCase());
        System.out.println(str2.toUpperCase());

        //toLowerCase
        System.out.println(str1.toLowerCase());
        System.out.println(str2.toLowerCase());

        String str = str1.substring(0,1).toUpperCase();
        System.out.println(str + str1.substring(1));
    }
}
