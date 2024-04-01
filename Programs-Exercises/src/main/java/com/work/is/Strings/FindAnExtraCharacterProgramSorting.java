package com.work.is.Strings;

import java.util.Arrays;

public class FindAnExtraCharacterProgramSorting {
    public static void main(String[] args){
        String s1 = "abcd";
        String s2 = "cbdae";

        System.out.println(findExtra(s1, s2));
    }

    public static char findExtra(String s1, String s2){
        char a1[] = s1.toCharArray();
        Arrays.sort(a1);

        char a2[] = s2.toCharArray();
        Arrays.sort(a2);

        int n = s1.length();
        for(int i = 0; i < n;i++){
            if(a1[i] != a2[i]){
                return a2[i];
            }
        }
        return a2[n];
    }
}
//Time Complexity - O(nlogn)