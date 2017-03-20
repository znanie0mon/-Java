package com.company.Lesson2;

import java.util.Scanner;

/**
 * Created by 123 on 17.03.2017.
 */
public class homework10 {

    public static void main(String[] args) {

        System.out.println("-----------------------------------------");
        System.out.println("Программа проверяющая, " +
                "является ли введённое пользователем \n с клавиатуры натуральное число — простым ");
        System.out.println("-----------------------------------------");

        System.out .println("Введите число");
        Scanner scann = new Scanner(System.in);
        int a = scann.nextInt();
        System.out.println(homework10.simpleNumber(a));


    }

    public static String simpleNumber (int num) {

        String rez = null;
        if (num <= 1)
            rez = "Число не простое";
        if (num == 2 || num == 3)
            rez = "Число простое";
        else {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    rez = "Число не простое";
                    break;
                } else {
                    rez = "Число простое";
                }
            }
        }
        return rez;
    }


}
