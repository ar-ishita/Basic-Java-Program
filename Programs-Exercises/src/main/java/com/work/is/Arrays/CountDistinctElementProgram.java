package com.work.is.Arrays;

import java.util.Scanner;

public class CountDistinctElementProgram {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];

        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        System.out.print(countDigits(a, n));
    }

    private static int countDigits(int[] a, int n) {
        int count = 0; boolean isDistinct = true;

        for(int i = 0; i < n; i++){
            for(int j = (i-1); j >= 0; j--){
                if(a[i] == a[j]){
                    isDistinct = false;
                }
            }
            if(isDistinct){
                count++;
            }
            isDistinct = true;
        }
        return count;

    }
}
