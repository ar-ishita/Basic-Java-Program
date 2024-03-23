package com.work.is;

import java.util.Scanner;

public class LastDigitProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = Math.abs(n);
        int res = y % 10;
        System.out.println("Last Digit : " +res);
    }
}
