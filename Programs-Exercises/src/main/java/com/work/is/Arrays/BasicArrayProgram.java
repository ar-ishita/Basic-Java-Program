package com.work.is.Arrays;

public class BasicArrayProgram {

    public static void main(String[] args)
    {
        //First Way
        int []a= {10, 20, 30, 40};
        System.out.println(a.length);
        a[2] = 50;
        System.out.println(a[2]);
        System.out.println(a[1]);

        //Second Way
        int []b;
        b = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        //Third Way
        int []c = new int[3];
        c[0] = 10;
        c[1] = 20;
        c[2] = 30;

        //Fourth Way
        int []d = new int[3];
        int x = 10;
        for(int i = 0; i <d.length; i++){
            a[i] = x;
            x = x  + 10;
        }

        //[]a vs a[]
        //I will work fine
        int[] ab = new int[4];
        int ab1[] = new int[4];

        //It will work finr
        int ab2[], v;
        ab2 = new int[4];
        v = 10;

        //below code will through an error
        int[] ab3, v1;
        ab3 = new int[4];
        //v1 = 10; //Error: Incompatible type : int cannot be converted to int[]

        //It will work fine
        int []ab4;
        ab4 = new int[4];

        //It will work fine
        int ab5[];
        ab5= new int[4];


    }
}
