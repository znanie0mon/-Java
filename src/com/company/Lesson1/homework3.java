package com.company.Lesson1;


import java.util.Scanner;

/**
 * Created by 123 on 15.03.2017.
 */
public class homework3 {

    public static void main () {

        int n = inputInteger();

        double w1 = (double) n;
        double x = (double)Math.round(w1);
        System.out.println(x);



    }

    private static int inputInteger () {
        int n;
        Scanner scann = new Scanner(System.in);
        String string = scann.nextLine();

        n = Integer.valueOf(string);
        return n;
    }

}
