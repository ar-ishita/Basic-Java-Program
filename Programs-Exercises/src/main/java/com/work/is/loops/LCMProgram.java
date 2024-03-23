package com.work.is.loops;

import java.util.Scanner;

public class LCMProgram {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num01 = sc.nextInt();
        int num02 = sc.nextInt();

        int x = Math.max(num01, num02);
        int y = num01 * num02;
        //int ans = x;
        for(int i = x; i <= y; i++){
            if(i % num01 == 0 && i % num02 == 0){
                x = i;
                break;
            }
        }
        System.out.println(x);
    }
}
