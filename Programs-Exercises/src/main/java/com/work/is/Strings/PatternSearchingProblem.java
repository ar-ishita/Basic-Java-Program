package com.work.is.Strings;

public class PatternSearchingProblem {

    public static void main(String[] args){
        patSearch("geeksforgeeks", "geeks");
    }

    public static void patSearch(String text, String pat){
        int pos = text.indexOf(pat);
        while(pos >= 0){
            System.out.println(pos + " ");
            pos = text.indexOf(pat, pos + 1);
        }
    }
}
