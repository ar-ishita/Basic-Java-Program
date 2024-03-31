package com.work.is.Strings;

public class ChangeCaseProblem {

    public static void main(String[] args){
        changeCase("hello");
    }

    public static void changeCase(String s){
        // code here

        String str = s.substring(0,1).toUpperCase();
        System.out.println(str + s.substring(1));
        System.out.println(s.toUpperCase());


    }
}
