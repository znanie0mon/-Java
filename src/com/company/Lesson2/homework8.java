package com.company.Lesson2;

import javax.swing.plaf.basic.BasicIconFactory;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by 123 on 17.03.2017.
 */
public class homework8 {
    public static void main(String[] args) {

        System.out.println("-----------------------------------------");
        System.out .println(" Программа, вычисляющая факториал " +
                "натурального числа n, которое пользователь введёт с клавиатуры");
        homework8 home = new homework8();
        home.factorial();

    }

    private void factorial () {

        Scanner scann = new Scanner(System.in);
        int b = scann.nextInt();
        BigInteger rez1 = BigInteger.valueOf(1);
        BigInteger iterator;



        do {
            if (b == 1) {
                System.out.println("Факториал числа " + b + " равен 1");
            } else if (b <= 0) {

                System.out.println("Ввведите неотрицательное число");
                scann = new Scanner(System.in);
                b = scann.nextInt();

            } else if (b==2) {

                System.out.println(" Факториал числа " + b + " равен 2");

            } else {
                for (int i=2; i<=b; i++) {
                    iterator = BigInteger.valueOf(i);
                    rez1 =  rez1.multiply(iterator);
                }
                System.out.println(" Факториал числа " + b + " равен " + rez1.toString());
            }

        } while (b<=0);
    }

}
