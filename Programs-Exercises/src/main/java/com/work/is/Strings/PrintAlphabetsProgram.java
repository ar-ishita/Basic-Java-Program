package com.work.is.Strings;

public class PrintAlphabetsProgram {

    public static void main(String[] args){
        char c1 = 'h';
        char c2 = 'u';
        printAplha(c1, c2);
    }

    public static void printAplha(char c1, char c2){
        System.out.println((int)c1);
        System.out.println((int)c2);

        for(char i = c1; i <= c2; i++){
            System.out.print(i + " ");
        }
    }
}
