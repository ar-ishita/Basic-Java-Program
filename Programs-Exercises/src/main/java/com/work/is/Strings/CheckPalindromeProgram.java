package com.work.is.Strings;

import java.util.Scanner;

public class CheckPalindromeProgram {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        a = a.toLowerCase();
        int start = 0;
        int end = a.length()-1;

        boolean isPal = true;
        while(start < end){
            if(a.charAt(start) != a.charAt(end)){
                isPal = false;
                break;
            }
            start++;
            end--;
        }
        if(isPal){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
