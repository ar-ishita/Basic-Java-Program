package com.work.is.loops;

import java.util.Scanner;

public class FibbonacciProgram {

    public static void main(String[] args){
        int a = 1, b =1, c =0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 0){
            System.out.println("1");
        }
        else if(n == 1){
            System.out.println("1");
        }
        else{
            System.out.print("1,");
            System.out.print("1,");
            for(int i = 2; i < n; i++){
                c = a + b;
                a = b;
                b = c;
                System.out.print(c + ", ");
            }

        }
    }
}
