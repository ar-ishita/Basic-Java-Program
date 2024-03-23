package com.work.is;

import java.util.Scanner;

public class DateBrforeNDaysProgram {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();

        int x = n % 7;
        int ans = d -x;

        if(ans > 0){
            System.out.println(ans);
        }
        else{
            ans = ans + 7;
            System.out.println(ans);
        }
    }
}
