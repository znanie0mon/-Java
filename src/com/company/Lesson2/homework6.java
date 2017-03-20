package com.company.Lesson2;

/**
 * Created by 123 on 17.03.2017.
 */
public class homework6 {

    public static void main(String[] args) {
        System.out.println("-----------------------------------------");
        System.out .println("Программа, выводящую на экран все " +
                "неотрицательные элементы последовательности 90 85 80 75 70 65 60 …. ");
        System.out.println("-----------------------------------------");

        int k = 0;
        int j = 10;
        for (int i = 90; i>0; i-=5) {

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
