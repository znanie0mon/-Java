package com.company.Lesson3;

/**
 * Created by 123 on 22.03.2017.
 */
public class homework3 {


    public static void main(String[] args) {


        int[] array = {5,44,2,-1,555,22,34,57,8888,30,55};

       int k = array.length; // длина исходного массива
       int m = k/2; // число определяет до какого момента нам нужно инвентировать исходный  массив
        int invent = 0;
        System.out.println("Исходный массив");
        for (int i = 0;i<array.length;i++) {
            System.out.print(" " + array[i] + "");
        }
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("Массив инвентируемый");

        for (int i = 0; i<array.length;i++){
            if(k%2 == 0 && i<m) {
                invent = array[i];
                array[i] = array[k-1];
                array[k-1] = invent;
                k--;

            } else if (k%2 !=0 && i<m+1) {
                invent = array[i];
                array[i] = array[k-1];
                array[k-1] = invent;
                k--;
            }
        }

        for (int i = 0;i<array.length;i++) {
            System.out.print(" " + array[i] + "");
        }

    }
}