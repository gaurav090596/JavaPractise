package com.company;
import java.util.Scanner;
import java.util.Random;

public class rockpapersciccor {
    public static void main(String[] args) {
        int i = 1;
        int comp_wins=0;
        int your_win=0;
        int tie = 0;
        while (i<=5) {
            Random rand = new Random();
            int comp = rand.nextInt(3);
//          System.out.println(comp);
            Scanner sc = new Scanner(System.in);
            System.out.println("pleas select any one number");
            System.out.println("0.(for rock), 1.(for paper) , 2.( for scissors)");
            int p1 = sc.nextInt();

            if (comp == 0 && p1 == 1) {
                System.out.println("you wins");
                your_win=your_win+1;
            } else if (comp == 0 && p1 == 2) {
                System.out.println("computer wins");
                comp_wins=comp_wins+1;
            } else if (comp == 1 && p1 == 0) {
                System.out.println("computer wins");
                comp_wins=comp_wins+1;
            } else if (comp == 1 && p1 == 2) {
                System.out.println("you wins");
                your_win=your_win+1;
            } else if (comp == 2 && p1 == 0) {
                System.out.println("you wins");
                your_win=your_win+1;
            } else if (comp == 2 && p1 == 1) {
                System.out.println("computer wins");
                comp_wins=comp_wins+1;
            } else {
                System.out.println("its a tie");
                tie = tie +1;

            }
            System.out.println("computer selected : " + comp);
            i++;
        }
        System.out.println("comp win :" + comp_wins);
        System.out.println("your win :" +  your_win);
        System.out.println("tie:" + tie);
    }
}
