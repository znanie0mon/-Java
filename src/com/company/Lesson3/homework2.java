package com.company.Lesson3;

/**
 * Created by 123 on 22.03.2017.
 */
public class homework2 {


    public static void main(String[] args) {

        int max = 0;

        int[][] matrix = new int[5][8];

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 8; j++) {

                matrix[i][j] = (int) (Math.random() * 199) - 99;

            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {

                if (j < 8) {
                    System.out.print(" " + matrix[i][j] + " ");

                }
            }
            System.out.println("");
        }
        System.out.println("---------------------------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {

                if (j<7) {
                    if (matrix[i][j] > matrix[i][j + 1]) {
                        max = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = max;
                    }
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            int j=7;
               if (i<4) {
                   if (matrix[i][j] > matrix[i + 1][j]) {
                       max = matrix[i][j];
                       matrix[i][j] = matrix[i + 1][j];
                       matrix[i+1][j] = max;
                   }
               }
            }

        System.out.println("Максимальный элемент в массиве = " + max);
        System.out.println("---------------------------------------------");



    }
}