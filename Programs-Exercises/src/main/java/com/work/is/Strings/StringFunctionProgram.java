package com.work.is.Strings;

public class StringFunctionProgram {

    public static void main(String[] args){
        String s1 = "geeksforgeeks";
        String s2 = "geeks";
        System.out.println(s1.contains(s2));

        //equals
        String s3 = "geeksforgeeks";
        String s4 = "geeksforgeeks";
        System.out.println(s3.equals(s4));

        //compareTo
        String s5 = "geeksforgeeks";
        String s6 = "her";
        int res = s5.compareTo(s6);
        if(res == 0){
            System.out.println("Same");
        }
        if(res > 0){
            System.out.println("S5 is greater");
        }
        if(res < 0){
            System.out.println("S5 is smaller");
        }

        //index
        String s7 = "geeksforgeeks";
        String s8 = "geeks";
        System.out.println(s7.indexOf(s8));
        System.out.println(s7.indexOf(s8,1));
    }
}
