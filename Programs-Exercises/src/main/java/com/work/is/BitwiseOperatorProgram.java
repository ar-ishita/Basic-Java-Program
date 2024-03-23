package com.work.is;

public class BitwiseOperatorProgram {

    public static void main(String[] args){
        int x = 3; int y =6;
        System.out.println(x & y); //bitwise AND
        System.out.println(x | y); //bitwise OR
        System.out.println(x ^ y); //bitwise XOR
        System.out.println(~x); //bitwise NOT (2^32 - 1-3)
        //left shift

        int a = 3;
        System.out.println(a << 1);
        System.out.println(a << 2);
        System.out.println(a << 4);
        System.out.println(a << 30);
        a =-1;
        System.out.println(a << 1);

        //right shift
        int b = 33;
        System.out.println(b >> 1);
        System.out.println(b >> 2);
        b = -2;
        System.out.println(b >> 1);
        System.out.println(b >> 2);
        b =-4;
        System.out.println(b >> 1);


        //unsigned right shift
        int c = -2;
        System.out.println(c >>> 1);
        System.out.println(c >>> 2);

        System.out.println((5^2^5)^2);

        //
        int number = 1000000;
        System.out.println(number * (number +1)/2);

    }
}
