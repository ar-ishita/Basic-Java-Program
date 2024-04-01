package com.work.is.Strings;

public class PatternAfterDecimalPointProgram {

    public static void main(String[] args){
        System.out.println(digitAfterDecimal("12.8987"));
    }

    public static String digitAfterDecimal(String number){
        int pos = number.indexOf('.');
        if(pos < 0){
            return " ";
        }
        else{
            return number.substring(pos + 1);
        }
    }
}
