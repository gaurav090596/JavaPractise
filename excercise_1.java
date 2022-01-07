package com.company;
import java.util.Scanner;

public class excercise_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you marks for 5 subjects");
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        float d = sc.nextInt();
        float e = sc.nextInt();
        float per = ((a+b+c+d+e)/5);
        System.out.println(per);
//integer integer operation is always integer so use float in all
    }
}
