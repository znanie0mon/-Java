package com.company.Lesson2;

/**
 * Created by 123 on 17.03.2017.
 */
public class homework7 {

    public static void main(String[] args) {

        System.out.println("-----------------------------------------");
        System.out .println("Создайте программу, выводящую на экран первые 20 " +
                "элементов последовательности 2 4 8 16 32 64 128" );
        System.out.println("-----------------------------------------");

        int k = 0;
        int j = 10;
        int s = 2;
        System.out.print(" "+ s + " ");
        for (int i = 1; i<20; i++) {

            s = s*2;
            if(k==j) {
                System.out.println("" + " " + s + " ");
                j = j+10;

            } else {

                System.out.print("" + " " + s + " ");
                k++;
            }

        }


    }
}
