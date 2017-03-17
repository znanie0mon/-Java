package com.company;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {


        // Начало

     		 /* 1 задание - В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую на экран результат деления q на w с остатком.
        Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.
         */
        int rez;
        int q;
        int w;
        int ostatok;

        System.out.println(" Введите первое число ");
        q = inputInteger();

        System.out.println(" Введите второе число ");
        w = inputInteger();

        rez = q/w;
        ostatok = q%w;

        System.out.println("для случая, когда в q хранится " + q +
                " а в w хранится " + w + "):" + q + "/" + w + "=" +  rez + " и " + ostatok +  " в остатке.");

/*

        2.     В переменной n хранится натуральное двузначное число.Создайте программу,
        вычисляющую и выводящую на экран сумму цифр числа n.

*/

        /*
            в программе не проверки на вводимсоть двузначного числа.
            Условимся что пользователь вводит коректное значение переменной
        */


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




    /*  4  задание можно обьеденить c 3
    */

        int n2;
        int sum1 = 0;
        double r1;
        int counter = 0;
        System.out.println("Ввведите трехзначное   число");
        n1 = inputInteger();
        r =  (double) n1;
        counter = capacity(n1);
        r =  (double) n1;

        for (int i=0; i<=counter; i++) {
            sum += r%10;
            r = r/10;
        }

        System.out.println("сумма цифр числа " + n1 + " = " + sum);


        /*
        3 задание
         */



        int n = inputInteger(); // в программе не проверяется является ли строка числом и числом типа double;

        double w1 = (double) n;
        double x = (double)Math.round(w);
        System.out.println(x);



        /*
          5 задание


        */

        System.out.println("");
        Scanner g = new Scanner(System.in);
        System.out.println("Введите вес человека");
        double a = g.nextFloat();
        double h = (a*0.9);
        System.out.println ("Вес человека на венере равен" + h );




    }


    private static int inputInteger () {
        int n;
        Scanner scann = new Scanner(System.in);
        String string = scann.nextLine();

        n = Integer.valueOf(string);
        return n;
    }

    private static int capacity (int n) {

      /*  double r;
        double d;
        int counter = 0;;
        r =  (double) n;
        d = r;
        System.out.println(d);
*/
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
