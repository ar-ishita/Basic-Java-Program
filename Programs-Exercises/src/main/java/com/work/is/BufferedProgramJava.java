package com.work.is;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedProgramJava {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string");
        String s = br.readLine();
        System.out.println("Your String is :" +s);
        System.out.println("Enter integer:");
        int value = Integer.parseInt(br.readLine());
        System.out.println("Your Integer is  : " +value);

    }
}
