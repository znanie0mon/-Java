package com.company.Lesson1;

import java.util.Scanner;

/**
 * Created by 123 on 15.03.2017.
 */
public class homework1 {
    public static void main(String[] args) {

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


    }

    private static int inputInteger () {
        int n;
        Scanner scann = new Scanner(System.in);
        String string = scann.nextLine();

        n = Integer.valueOf(string);
        return n;
    }


}


