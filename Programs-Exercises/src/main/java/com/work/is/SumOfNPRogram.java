package com.work.is;

import java.util.Scanner;

public class SumOfNPRogram {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = (n * (n+1))/2;
        System.out.println("Sum of n natuaral Number : "+sum);

        //More Efficient Code that will avoid overflow
        int result = 0;
        if(n % 2 == 0){
            result = (n/2) * (n+1);
        }
        else {
            result = ((n+1)/2) * n;
        }
        System.out.println("Sum of n natural Number Efficient : "+result);
    }
}

//Time Complexity - O(1)