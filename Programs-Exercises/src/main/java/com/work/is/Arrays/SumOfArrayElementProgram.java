package com.work.is.Arrays;

public class SumOfArrayElementProgram {

    public static int sumArray(int []arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args){
        int []arr = {5,6,7,8};
        sumArray(arr);
    }
}
