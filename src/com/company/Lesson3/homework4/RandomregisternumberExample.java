package com.company.Lesson3.homework4;


/**
 * Created by 123 on 24.03.2017.
 */
public class RandomregisternumberExample {


    public static void main(String[] args) {

        Randomregisternumber rgn = new Randomregisternumber();
        System.out.println("--------------------");
        System.out.println("Автомобильные номера");
        System.out.println("--------------------");
        for (int i = 0; i<=100; i++) {

            rgn.randomizeRegisterNumber();
        }

        System.out.println("---------------------");

        rgn.setCountUniqueAutoNumbers();
    }



}
