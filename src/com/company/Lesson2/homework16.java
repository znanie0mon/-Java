package com.company.Lesson2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 123 on 17.03.2017.
 */
public class homework16 {


    public static void main(String[] args) {



        String numner = "";
        boolean condition = true;
        int k = 0;
        for (int i = 1; i<=99999; i++) {

            numner = Integer.toString(i);

            condition = test(numner);
            if (condition) {
                k++;
            }

        }
        System.out.println("всего таких ошибочных табличек оказалось " + k + " в бракованной партии");

    }
    public static boolean test(String testString){
        String f = "((2+.*)|(.*2+))|((13+.*)|(.*13+))";
        Pattern p = Pattern.compile(f);
        Matcher m = p.matcher(testString);
        return m.matches();
    }



}
