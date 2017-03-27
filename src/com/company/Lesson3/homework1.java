package com.company.Lesson3;

import com.company.Main1;

/**
 * Created by 123 on 22.03.2017.
 */
public class homework1 {

    public static void main (String[] args){

        int[][] matrix = new int[8][5];

        for(int i = 0; i<8; i++) {

            for (int j = 0; j<5; j++) {

                 matrix[i][j] = (int)(Math.random()*90)+10;

            }
        }

        for(int i = 0; i<8; i++) {


            for (int j = 0; j < 5; j++) {

                if (j<8) {
                    System.out.print(" " + matrix[i][j] + " ");

                }

            }
            System.out.println("");
        }




        int[] a = new int[10];
        int  k = (int)(Math.random() *10);
        a[k] = 1;
        int j = k;
         int iterations = 0;
        /*for (int i= 0; i<5; i++) {*/
                do {

                    k = (int) (Math.random() * 10);
                    iterations++;

                } while (k != j && a[k] !=0 );
                j=k;
                a[k] = 1;


        // 
        System.out.println("iterations = " + iterations);
        System.out.println("---------------------------");
        for (int i= 0; i<a.length; i++) {

            System.out.println("Элемент массива равен = " + a[i]);

        }
    }

}
