package com.work.is.loops;

import java.util.Scanner;

public class IfEvenOddProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        if(value % 2 == 0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
        sc.close();
    }
}
