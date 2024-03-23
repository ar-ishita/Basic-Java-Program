package com.work.is.conditions;

import java.util.Scanner;

public class CalculatorIfElseProgram {

    public static void main(String[] args){
        int a, b, result=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the operation : \n" +
                "1. Addition \n" +
                "2. Substration \n" +
                "3. Multiplication\n" +
                "4. Division");
        int operation = sc.nextInt();
        if(operation != 1 && operation !=2 && operation != 3 && operation!=4){
            System.out.println("Enter the valid input");
        }
        else{
            System.out.println("Enter first integer");
            a = sc.nextInt();
            System.out.println("Enter second integer");
            b = sc.nextInt();
            if(operation == 1){
                result = a + b;
                System.out.println("Addition : "+ result);
            } else if (operation ==2) {
                result = a - b;
                System.out.println("Substration : " +result);
            } else if (operation == 3) {
                result = a * b;
                System.out.println("Multiplication : " +result);
            }
            else {
                result = a / b;
                System.out.println("Division : " +result);
            }
        }
    }
}
