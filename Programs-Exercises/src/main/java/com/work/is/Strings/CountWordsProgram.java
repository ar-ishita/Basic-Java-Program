package com.work.is.Strings;

public class CountWordsProgram {

    public static void main(String[] args){
        System.out.println(countWords("Geeksforgeeks programming language"));
    }

    public static int countWords(String str)
    {
        // find and return the number of words
        // present in the string
        int countWords = str.split("\\s").length;
        return countWords;
    }
}
