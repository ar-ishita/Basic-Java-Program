package com.work.is.Arrays;

public class MaximumInArrayElementProgram {

    public static void maximum(int []arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args){
        int []arr = {4,2,6,1,5,9};
        maximum(arr);
    }
}

//Time Complexity = O(n)