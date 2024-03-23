package com.work.is.loops;

import java.util.Scanner;

public class TableProgram {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int range = sc.nextInt();

        for(int i = 1; i <=range; i++){
            System.out.println(num + " * " + i + " = " + (i * num) );
        }
    }
}
