package com.company;
import java.util.Scanner;

public class takinginput {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no 1" );
        int a =sc.nextInt();
        System.out.println("enter no 2");
        int b =sc.nextInt();
        int sum = a + b;
        System.out.println("the sum is");
        System.out.println(sum);
        boolean b1 = sc.hasNextInt();
        System.out.println((b1));
        String str = sc.nextLine();
        System.out.println(str);


    }
}
