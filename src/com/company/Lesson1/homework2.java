package com.company.Lesson1;
import  com.company.Lesson1.homework1;

import java.util.Scanner;

/**
 * Created by 123 on 15.03.2017.
 */
public class homework2 {

    public static void main (String[] ars) {

        int n1;
        int sum = 0;
        double r;
        double d;
        System.out.println("Ввведите двухзначное число");
        n1 = inputInteger();
        r =  (double) n1;

        for (int i=0; i<2; i++) {

            sum += r%10;
            r = r/10;

        }

        System.out.println("сумма цифр числа " + n1 + " = " + sum);

    }
    private static int inputInteger () {
        int n;
        Scanner scann = new Scanner(System.in);
        String string = scann.nextLine();

        n = Integer.valueOf(string);
        return n;
    }

}
