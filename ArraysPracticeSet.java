package com.company;

public class ArraysPracticeSet {
    public static void main(String[] args) {
//         float [] marks = {22.5f,55.6f,99.5f};
//         float sum =0;
//         for(float ele : marks)
//         {
//             sum =sum+ele;
//         }
//        System.out.println(sum);



//        float [] marks = {22.5f,55.6f,99.5f};
//         float sum =0;
//         boolean f =false;
//         for(float ele : marks)
//         {
//             if(ele==55.6f){
//                 f= true;
//                 break;
//             }
//
//         }
//        if(f)
//        {
//            System.out.println("hai bhai");
//        }
//        System.out.println(sum);

//    int [][] mat1 = {{1,2,3},{4,5,6}};
//
//    int [][] mat2 = {{5,2,3},{7,5,67}};
//
//    int [][] result={{0,0,0},{0,0,0}};
//
//
//    for (int i=0;i<mat1.length;i++)
//    {
//        for (int j=0;j<mat1[i].length;j++)
//        {
//            result[i][j]=mat1[i][j]+mat2[i][j];
//            System.out.print(result[i][j]+" ");
//
//        }
//    }
//        int [] arr = {1,2,3,4,5,6};
//        int l = arr.length;
//        int n = Math.floorDiv(l,2);
//        int temp;
//        for(int i=0;i<n;i++)
//        {
//            temp = arr[i];
//            arr[i] =arr[l-i-1];
//            arr[l-i-1] = temp;
//        }
//        for(int ele :arr){
//            System.out.println(ele+" ");
//        }
//
//        int [] mm = {1,2,3,4,5,6};
//        int max =0;
//        for(int ele : mm)
//        {
//            if(ele>max)
//            {
//                max = ele;
//            }
//
//        }
//        System.out.println(max);
        boolean f = true;
        int [] sor = {100,2,13,4,54,6};
        for(int i=0;i<sor.length-1;i++) {
            if (sor[i] > sor[i + 1]) {
                f = false;
                break;

            }
        }
            if(f)
            {
                System.out.println("sorted");
            }
            else
            {
                System.out.println("not sorted");
            }


    }
}
