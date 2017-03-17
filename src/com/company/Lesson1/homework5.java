package com.company.Lesson1;

import java.util.Scanner;
/**
 * Created by 123 on 15.03.2017.
 */
public class homework5 {

    public static void main (String[] args) {

        System.out.println("Ввведите свой вес на Земле ");
        Scanner x = new Scanner(System.in);
        double a = x.nextFloat();
        double c = (a*0.9);
        System.out.println (String.format("Вес человека на Венере =", c));


    }

}
