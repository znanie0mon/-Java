package com.company.Lesson2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 123 on 17.03.2017.
 */
public class homework15 {


    public static void main(String[] args) {

        int b = 0;

        for(int i = 0; i<=24; i++) {

            for (int j = 0; j <= 59; j++){

            if(i/10%10 == j%10 && i%10 == j/10%10 ) {
                b++;
            }

            }

        }

        System.out.println("Количество симметиричных комбинаций всего = " + b);

    }


    private static String reverseString(String s){

        String r = "";

        for (int i = s.length()-1; i>=0; --i ) {r += s.charAt(i);}

        return r;
    }

    private static boolean isPalindrome(String s) {return s.equals(reverseString((s)));}



}
