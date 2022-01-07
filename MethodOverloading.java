package com.company;

public class MethodOverloading {
    static int plus(int a){
        a = 5;
        return a;
    }
    static int plus(int a,int b)
    {
        int c =a+b;
        return c;
    }

    public static void main(String[] args) {
        plus(5,7);
        System.out.println(plus(5,5));
    }
}
