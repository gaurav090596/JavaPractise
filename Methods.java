package com.company;

public class Methods {

     int multi(int x, int y)
    {
        int c;
        c=x*y;
        return c;
    }
    static int logic(int x, int y) {
        int c;
        if (x > y) {
            c = x + y;
        } else {
            c = x - y;
        }

        return c;

    }

    int logic1(int a, int b) {
        int d;
        if (a > b) {
            d = a + b;
        } else {
            d = a - b;
        }

        return d;
    }

    public static void main(String[] args) {



        int z = logic(10, 9);
        System.out.println("the answer is");
        System.out.println(z);
        System.out.println("++++++++++++++++++++");
        Methods obj =new Methods();
        int sum=obj.logic1(20,10);
        System.out.println(sum);


//        System.out.println(multi(5,4));
        Methods mu = new Methods();
        System.out.println(mu.multi(7,7));

    }
}



