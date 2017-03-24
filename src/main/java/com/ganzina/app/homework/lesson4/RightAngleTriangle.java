package com.ganzina.app.homework.lesson4;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Ievgeniia on 3/24/2017.
 */
public class RightAngleTriangle {

        public static void validateTriangle(){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter length of first triangle side and press Enter");
        double a=scanner.nextDouble();

        System.out.println("Please enter length of second triangle side and press Enter");
        double b=scanner.nextDouble();

        System.out.println("Please enter length of third triangle side and press Enter");
        double c=scanner.nextDouble();

        if ((b<(c+a))&&(c<(a+b))&&(a<(b+c))) //validation that such triangle exists at all;
            if ((a*a==b*b+c*c)||(b*b==a*a+c*c)||(c*c==b*b+a*a))
                System.out.println("Your triangle is right-angled");
            else
                System.out.println("Your triangle is not right-angled");

        else
            System.out.println("Such triangle does not exist, please try again and keep in mind that each side value " +
                    "has to be less than sum of two others");
    }
}
