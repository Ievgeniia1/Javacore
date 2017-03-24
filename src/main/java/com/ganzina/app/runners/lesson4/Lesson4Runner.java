package com.ganzina.app.runners.lesson4;

import com.ganzina.app.homework.lesson4.EvenOrOdd;
import com.ganzina.app.homework.lesson4.RightAngleTriangle;

import java.util.Scanner;

import static com.ganzina.app.homework.lesson4.BiggerNumber.defineBigger;
import static com.ganzina.app.homework.lesson4.EvenOrOdd.defineEvenOrOdd;
import static com.ganzina.app.homework.lesson4.RightAngleTriangle.validateTriangle;


/**
 * Created by Ievgeniia on 3/24/2017.
 */
public class Lesson4Runner {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter number of task you would like to run");
        System.out.println("1 - Check if 3 digits could be the side of right-angled triangle");
        System.out.println("2 - Define if number is even or odd");
        System.out.println("3 - Define which number from two entered is bigger");
        int a = scn.nextInt();

        if ((a==1)||(a==2)||(a==3))

            if (a==1)
                validateTriangle();
                else
                if (a==2)
                    defineEvenOrOdd();
                else
                    defineBigger();
        else
            System.out.println("Wrong input, use only 1, 2, or 3");






    }
}

