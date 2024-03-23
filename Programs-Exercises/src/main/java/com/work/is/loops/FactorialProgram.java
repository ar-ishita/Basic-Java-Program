package com.work.is.loops;

import java.util.Scanner;

public class FactorialProgram {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int fact = 1;

        for(int i = n; i>=1 ;i--){
            num *= i;

        }
        System.out.println(num);

        for(int i = 2; i<=n; i++){
            fact *= i;

        }
        System.out.println(fact);
    }
}
//Time Complexity: O(n)
//
//Auxiliary Space: O(n)