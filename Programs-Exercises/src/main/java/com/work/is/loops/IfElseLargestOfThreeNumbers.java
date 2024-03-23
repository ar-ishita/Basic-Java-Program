package com.work.is.loops;

import java.util.Scanner;

public class IfElseLargestOfThreeNumbers {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();

        int ans_1 = Math.max(a,b);
        int ans = Math.max(ans_1, c);
        System.out.println("Largest Number is : " +ans);


        if(a >= b && a >= c){
            System.out.println("a is largest");
        } else if (b >= a && b >= c) {
            System.out.println("b is largest");
        }
        else {
            System.out.println("c is largest");
        }

    }
}
