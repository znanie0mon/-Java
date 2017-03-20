package com.company.Lesson2;

import java.util.Scanner;

/**
 * Created by 123 on 17.03.2017.
 */
public class homework11 {


    public static void main(String[] args) {


        System.out.println("-----------------------------------------");
        System.out.println("Программа выввода на экран первые 11 членов последовательности Фибоначчи.\n " +
                "Напоминаем, что первый и второй члены последовательности равны единицам, \n" +
                "а каждый следующий — сумме двух предыдущих.");
        System.out.println("-----------------------------------------");


        int a;
        homework11 home = new homework11();
        for (int i = 1; i<=11; i++) {
          a = homework11.fibonachi(i);
          System.out.println(" ");
        }

    }

  private  static  int fibonachi(int i) {
        if (i == 1) return 1;
        if (i == 2) return 1;
        return fibonachi(i - 1) + fibonachi(i - 2);
    }



}
