package com.work.is.Functions;

import java.util.Scanner;

public class PrimeFactorizationProgram {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        System.out.println(args.length);
        printFactors(n);
    }

    public static void printFactors(int n){
        for(int i =2; i <=n ;i++){
            if(isPrime(i)){
                int x = i;
                while(n % x == 0){
                    System.out.print(i + ", ");
                    x = x * i;
                }
            }
        }
    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        if(n == 2 || n ==3){ return true;}

        if(n%2==0 || n%3 == 0){ return false;}

        for(int i =5; i * i <= n; i += 6){
            if(n % i == 0 || n % (i +2) == 0){
                return false;
            }
        }
        return true;
    }
}
