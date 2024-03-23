package com.work.is.Arrays;

import java.util.Scanner;

public class CheckArraySortedOrNotProgram {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];

        for(int  i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        boolean ans = isSorted(a,n);

        if(ans){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    private static boolean isSorted(int[] a, int n) {
        for(int i = 1; i < n; i++){
            if(a[i] < a[i-1]){
                return false;
            }

        }
        return true;
    }
}
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(1)