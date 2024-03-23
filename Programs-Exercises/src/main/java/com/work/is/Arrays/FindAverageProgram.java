package com.work.is.Arrays;

import java.util.Scanner;

public class FindAverageProgram {

    public static double findAverage(int []arr){

        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        double average = sum/arr.length;
        System.out.println(average);
        return average;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        findAverage(arr);

        double sum = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] >= 0){
                sum += arr[i];
                count++;
            }
        }

        double average = sum / count;
        System.out.println("Average :" +average);

    }
}
