package com.company.Lesson2;

import java.util.Random;

/**
 * Created by 123 on 15.03.2017.
 */
public class homework2 {


    public static void main(String[] args) {

        Random random = new Random(100);

        for(int i = 0; i<100; i++) {
            int random1 = randomValueInbound(100,999);
            System.out.println("t= " + random1);
        }





      for (int j = 0; j<100; j++) {

          int a = random.nextInt(999);
          int maxNumber = 0;
          int ostatok = 0;
          double rez = (double) a;
          /*System.out.println("Случайное трехзначное число равно = " + a);*/
          if (a >= 100) {
              for (int i = 0; i < 3; i++) {

                  ostatok = (int) rez % 10;
                  rez = rez / 10;
                  if (maxNumber <= ostatok) {

                      maxNumber = ostatok;
                  }
              /*System.out.println("В числе " + a + " наибольшая цифра " + maxNumber);*/

           /* System.out.println("rez= " + rez + " ostatok= " + ostatok);*/
              }
              System.out.println("В числе " + a + " наибольшая цифра " + maxNumber);
          }
      }
    }


    public static int randomValueInbound (int start,int end) {

        int a;
        Random random = new Random();
        a = random.nextInt(end);

        do {

            a = random.nextInt(end);

        } while (a<100);

        return a;
    }




}
