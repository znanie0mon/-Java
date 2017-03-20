package com.company.Lesson2;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by 123 on 15.03.2017.
 */
public class homework1 {
    public static void main(String[] args) {

        int a;
        Random random = new Random(5);
        a = random.nextInt(155);



        for(int i = 0; i<500; i++) {
            a = random.nextInt(155);
                if(a>=5) {
                    if (a > 25 && a < 100) {
                        System.out.println("Число " + a + "  содержится в интервале (25,100)");

                    } else if (a < 25 || a > 100) {

                        System.out.println("Число " + a + " не содержится в интервале (25,100)");
                    }
                }
        }








    }
}
