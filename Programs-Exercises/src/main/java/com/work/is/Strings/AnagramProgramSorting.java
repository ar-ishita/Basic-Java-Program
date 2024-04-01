package com.work.is.Strings;

import java.util.Arrays;

public class AnagramProgramSorting {

    public static void main(String[] args){
        System.out.println(areAnagram("listen","silent"));
    }

    public static boolean areAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] a1 = s1.toCharArray();
        Arrays.sort(a1);
        s1 = new String(a1);

        char[] a2 = s2.toCharArray();
        Arrays.sort(a2);
        s2 = new String(a2);

        return s1.equals(s2);
    }
}

//Time Complexity: O(N*logN)
//Auxiliary Space: O(1)