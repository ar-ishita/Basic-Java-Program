package com.work.is.loops;

import java.util.Scanner;

public class InvertedRightAngle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        for(int i = s; i >= 1; i--){

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
