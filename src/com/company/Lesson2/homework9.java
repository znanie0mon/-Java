package com.company.Lesson2;


import java.util.Scanner;

/**
 * Created by 123 on 17.03.2017.
 */
public class homework9 {

    public static void main(String[] args) {

        System.out.println("-----------------------------------------");
        System.out .println(" Программа выводящая \n" +
                "все положительные делители натурального числа, введённого пользователем с клавиатуры. ");

        Scanner scann = new Scanner(System.in);
        int b = scann.nextInt();
        int rez = 0;

        do {
            if (b==0) {
                scann = new Scanner(System.in);
                b = scann.nextInt();

            } else {

                for (int i=1; i<=b;i++) {

                    if (b%i == 0) {
                        System.out.println(" " + i + " ");
                    }

                }
            }

        }while (b>=1);

    }

}



