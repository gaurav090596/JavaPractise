package com.company;

public class arrays {
    public static void main(String[] args) {

//        int [] marks = new int[5];

        int [] marks = {100,200,300,400,500};
//        marks[1]=100;
//        marks[2]=200;
//        marks[3]=300;
//        marks[4]=500;
//        marks[5]=700;
        System.out.println(marks[4] +" " + marks[0]);
        System.out.println(marks.length);
//        System.out.println();

        String [] student = {"gaurav","babu","raja"};
        System.out.println(student[1]);


//        displaying array names
        for(int i=0;i<marks.length;i++)
        {
            System.out.print(marks[i]);
            System.out.print(" ");
        }
        for(int i= marks.length-1;i>=0.;i--)
        {
            System.out.print(marks[i]);
            System.out.print(" ");
        }
//        ..for each loop
        System.out.println(" ");
        System.out.println("for each loop ");
        for(int ele : marks)
        {
            System.out.println(ele);
        }


    }

        }
