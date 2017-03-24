package com.ganzina.app.homework.lesson4;

import java.util.Scanner;

/**
 * Created by Ievgeniia on 3/24/2017.
 */
public class RightAngleTriangle {

        public static String validateTriangle(int a, int b, int c){
        String resultMessage="";

        if ((b<(c+a))&&(c<(a+b))&&(a<(b+c))) //validation that such triangle exists at all;


            if ((a*a==b*b+c*c)||(b*b==a*a+c*c)||(c*c==b*b+a*a)){
                resultMessage="Your triangle is right-angled";
                System.out.println(resultMessage);


        }

            else  {
            resultMessage="Your triangle is not right-angled";
            System.out.println(resultMessage);
            }

        else {
            resultMessage="Such triangle does not exist";
            System.out.println(resultMessage);
            }

           return resultMessage;
         }
}
