package com.company.Lesson2;

/**
 * Created by 123 on 17.03.2017.
 */
public class homework5 {

    public static void main(String[] args) {
        System.out.println("-----------------------------------------");
        System.out.println(" Последовательность из 55 элементов 1,3,5,7,9,11,13 ");
        System.out.println("-----------------------------------------");

        int k = 0;
        int j = 10;
        for (int i = 1; j<55; i=i+2) {

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
