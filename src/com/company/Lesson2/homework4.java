package com.company.Lesson2;

/**
 * Created by 123 on 17.03.2017.
 */
public class homework4 {

    public static void main(String[] args) {

        int k=0;
        int j = 10;
        System.out.println("-----------------------------------------");
        System.out.println(" Последовательность четерехзначных чисел ");
        System.out.println("-----------------------------------------");
        for (int i =1000; i<10000;i=i+3) {

            if(k==j) {
                System.out.println("" + " " + i + " ");
                j = j+10;

            } else {

                System.out.print("" + " " + i + " ");
                k++;
            }


        }

    }

}
