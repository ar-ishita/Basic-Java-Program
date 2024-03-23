package com.work.is;

import java.util.Scanner;

public class FindNTermAPProgram {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Term");
        int a = sc.nextInt();
        System.out.println("Enter Difference");
        int d = sc.nextInt();
        System.out.println("Enter Nth Term");
        int n = sc.nextInt();

        int ans = a + ((n-1)*d);
        System.out.println(ans);
    }
}
//Time Complexity: O(1), the code will run in a constant time.
//Auxiliary Space: O(1), no extra space is required, so it is a constant.