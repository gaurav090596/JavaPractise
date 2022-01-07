package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
       while (true){
            Scanner sc = new Scanner(System.in);
           System.out.println("enter a number ");
            int num = sc.nextInt();
            int a=0;

            for (int i=2;i<num;++i) {
                    a = num%i;
                if(a==0) {
                    System.out.println(" not prime number");
                    break;
                }
                else if (i==(num-1)) {
                        System.out.println("prime");
                    }
                }

                }
                }






            }




