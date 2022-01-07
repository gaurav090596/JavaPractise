package com.company;

public class VarArgs {

//    static int sum(int a,int b){
//        return a+b;
//    }static int sum(int a,int b,int c){
//        return a+b+c;
//    }
    static int add(int x,int y)
    {
        return x+y;
    }static byte add(byte x,byte y,byte z)
    {
        return (byte) (x+y+z);
    }

    static int sum(int ...arr)
    {
        int sum=0;
        for (int a:arr)
        {
             sum= sum+a;
        }
        return sum;
    }
    public static void main(String[] args) {
//        System.out.println("welcomre to var args tutorial");
        System.out.println(sum(4,5));
        System.out.println(sum(4,5,7));
        System.out.println(sum(4,5,6));
        System.out.println(add(4,5));
    }

}
