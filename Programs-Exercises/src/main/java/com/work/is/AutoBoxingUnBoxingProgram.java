package com.work.is;

public class AutoBoxingUnBoxingProgram {

    public static void main(String[] args){
        int x1 = 10;
        Integer x2 = x1; //AutoBoxing
        int x3 = x2; //Boxing

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);

        //in below function, this is right as these are  different objects and thats as Integer is non-primitive : Not Same
        Integer a = 400, b =400;
        if(a == b){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }

        //in below function, O/p - Same. This is because Java cache some literals.They point to the same literals.
        Integer a1 = 40, b2 =40;
        if(a1 == b2){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }
    }
}
