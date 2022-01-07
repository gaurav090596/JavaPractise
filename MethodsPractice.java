package com.company;

public class MethodsPractice {

    static void multi(int x)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(x*i);
        }

    }
    static void pattern1(int x)
    {
        int n =5;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }else
        {
            return n + sum(n-1);
        }
    }
    static void pattern2(int n)
    {
        for (int i=0;i<=n;i++)
        {
            for(int j=n-i;j>=0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static int arr(int ...sum)
    {
        int sum1=0;
        for (int i=0;i<sum.length;i++)
        {
             sum1 = sum1 + sum[i];
        }
        return  sum1;

    }

    public static void main(String[] args) {
//        multi(5);
//        pattern1(5);
//        System.out.println(sum(3));
//        pattern2(3);
        System.out.println(arr(5,5,10,20));
    }



}
