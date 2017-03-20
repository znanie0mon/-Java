package com.company.Lesson2;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by 123 on 15.03.2017.
 */
public class homework1 {
    public static void main(String[] args) {

        int a;
        Random random = new Random(5);
        a = random.nextInt(155);



        for(int i = 0; i<500; i++) {
            a = random.nextInt(155);
                if(a>=5) {
                    if (a > 25 && a < 100) {
                        System.out.println("Число " + a + "  содержится в интервале (25,100)");

                    } else if (a < 25 || a > 100) {

                        System.out.println("Число " + a + " не содержится в интервале (25,100)");
                    }
                }
        }


/*        do {

            for (int i = 5; i<=155;i++) {

                if (a==i) {
                    a=i;
                    break;
                }

            }
            System.out.println("Введите корректное число из диапазона от 5 включительно до 155 вкл");
            scann = new Scanner(System.in);
            string = scann.nextLine();
            a = Integer.valueOf(string);

        } while (a<5 && a>155);*/







  /*      int[] interval1 = new int[74];
        int k = 5;
        for (int i=0; i<interval1.length;i++) {


            interval1[i] = k;
            k++;

        }

         for (int i =0;i<interval1.length; i++) {

            System.out.println(+ i + " элемент равен " + interval1[i]);

        }

        int[] interval2 = new int[74];
        k = 26;
        for (int i=0; i<interval2.length;i++) {


            interval2[i] = k;
            k++;

        }*/



        /*for (int i =0;i<interval.length; i++) {

            System.out.println(+ i + " элемент равен " + interval[i]);

        }*/

    }
}
