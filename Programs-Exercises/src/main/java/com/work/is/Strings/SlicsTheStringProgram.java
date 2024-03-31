package com.work.is.Strings;

public class SlicsTheStringProgram {

    public static void main(String[] args){
        System.out.println(sliceString("Hello"));

    }

    public static String sliceString(String s){
        // code here

        String str = s.substring(1, s.length()-1);
        return str;
    }
}
