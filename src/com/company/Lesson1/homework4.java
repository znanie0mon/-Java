package com.company.Lesson1;

import java.util.Scanner;

/**
 * Created by 123 on 15.03.2017.
 */
public class homework4 {

    public static void main () {


        int n;
        int sum = 0;
        double r;
        int counter = 0;
        System.out.println("Ввведите трехзначное   число");
        n = inputInteger();
        r =  (double) n;
        counter = capacity(n);
        r =  (double) n;

        for (int i=0; i<=counter; i++) {
            sum += r%10;
            r = r/10;
        }

        System.out.println("сумма цифр числа " + n + " = " + sum);


    }

    private static int inputInteger () {
        int n;
        Scanner scann = new Scanner(System.in);
        String string = scann.nextLine();

        n = Integer.valueOf(string);
        return n;
    }

    private static int capacity (int n) {


        int counter = 0;
        if (n / 10 == 0) {
            counter = 1;
            /*System.out.println("Введенное число " + counter + "-х значное");*/
            return counter;
        } else {
            do {

                n = n / 10;
                counter++;
                /*System.out.println("counter = " + counter);
                System.out.println("n = " + n);*/
            } while (n / 10 != 0);
        }

        counter = counter + 1;
        /*System.out.println("Введенное число " + counter + "-х значное");*/
        return counter;


    }


}
