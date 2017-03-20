 package com.company.Lesson2;

import java.util.*;
/**
 * Created by 123 on 15.03.2017.
 */
public class homework3 {


    public static void main(String[] args) {
        Random rand1=new Random();
        int a= rand1.nextInt(28800);
        int b=a/60/60;
        System.out.println("Петрову осталось работать "+a+" сек");
        switch(b) {
            case 0:
                System.out.println("До конца рабочего дня осталось меньше часа");
                break;
            case 1:
                System.out.println("До конца рабочего дня остался " + b + " час");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("До конца рабочего дня осталось " + b + " часа");
                break;
            default:
                System.out.println("До конца рабочего дня осталось " + b + " часов");

        }
    }

}
