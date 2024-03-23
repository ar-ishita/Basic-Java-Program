package com.work.is;

import java.util.Scanner;

public class FindNTermGPProgram {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Term");
        int a = sc.nextInt();
        System.out.println("Enter Difference");
        int d = sc.nextInt();
        System.out.println("Enter Nth Term");
        int n = sc.nextInt();

        int ans = a * (int)(Math.pow(d,n-1));
        System.out.println(ans);
    }
}

//Time complexity: O(log N) because using the inbuilt pow function
//Auxiliary Space: O(1)
