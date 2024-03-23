package com.work.is;

import java.util.Scanner;

public class SwitchCaseProgram {

    public static void main(String[] args){
        int x = 0, y= 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character");
        char move = sc.next().charAt(0);
        switch (move){

            case 'L' :
                x--;
                break;
            case 'R' :
                x++;
                break;
            case 'U' :
                y++;
                break;
            case 'D' :
                y--;
                break;
            default:
                System.out.println("Invalid Input");
        }
        System.out.println("Value of X :" +x);
        System.out.println("Value of Y : " +y);
    }
}
