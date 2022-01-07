package com.company;

public class Recursion {
    static int factorial(int n)
    {
        if(n==0 || n==1){
            return 1;
        }else
        {
            return n* factorial(n-1);
        }
    }

    public static void main(String[] args) {
        int m=factorial(4);
        System.out.println(m);
        int a =4;
        int fac =1 ;
        for (int i=1;i<=a;i++)
        {
            fac=fac*i;
        }
        System.out.println(fac);
        System.out.println("++++++++++++++++++++");

        int a1=0,b=1,c;
        int n=10;
        System.out.print(a1);
        System.out.print(" ");
        System.out.print(b);
        System.out.print(" ");
        for (int i=0;i<n;i++)
        {
            c=a1+b;
            System.out.print(c);
            System.out.print(" ");
            a1=b;
            b=c;
        }
    }
}
