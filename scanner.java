package com.company;
import java.time.LocalDateTime;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Hello, Please enter your Details   " + dt);

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("select 1 to insert  record");
            System.out.println("select 2 to delete  record");
            System.out.println("select 3 to update  record");
            System.out.println("select 4 to show  record");
            System.out.println("select 5 to quit");
            int a = sc.nextInt();
            if(a==1)
            {
                System.out.println("please enter your name");
                String name = sc.next();

                System.out.println("please enter your place");
                String place = sc.next();

                System.out.println("please enter your fees 1000,5000,10000");
                int fees = sc.nextInt();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }




    }

}