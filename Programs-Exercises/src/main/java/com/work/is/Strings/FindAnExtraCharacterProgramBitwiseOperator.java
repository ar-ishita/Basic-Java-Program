package com.work.is.Strings;

public class FindAnExtraCharacterProgramBitwiseOperator {

    public static void main(String[] args){
        String s1 = "abcd";
        String s2 = "cbdae";

        System.out.println(findExtra(s1, s2));
    }

    public static char findExtra(String s1, String s2){
        int res = 0;
        int n  = s1.length();
        for(int i = 0; i <n; i++){
            res = res^s2.charAt(i)^s1.charAt(i);
        }
        res = res^s2.charAt(n);
        return (char)res;
    }
}

//Time Complexity: O(N).
//Auxiliary Space: O(1).