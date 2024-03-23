package com.work.is;

import java.util.Scanner;

public class LeapYearIfElseProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year  = sc.nextInt();

        if(year % 4 == 0 && year % 100 != 0){
            System.out.println("Year is Leap Year");
        } else if (year % 400 == 0) {
            System.out.println("Year is a Leap Year : " +year);
        }
        else {
            System.out.println("Year is not leap Year");
        }
    }
}
