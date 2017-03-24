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
        System.out.println("1 - Check if 3 digits could be the sides of right-angled triangle");
        System.out.println("2 - Define if number is even or odd");
        System.out.println("3 - Define which number from two entered is bigger");
        int input = scn.nextInt();

        if ((input==1)||(input==2)||(input==3))

            if (input==1) {
                System.out.println("Please enter integer length of first triangle side and press Enter");
                int a = scn.nextInt();

                System.out.println("Please enter integer  length of second triangle side and press Enter");
                int b = scn.nextInt();

                System.out.println("Please enter integer length of third triangle side and press Enter");
                int c = scn.nextInt();

                validateTriangle(a,b,c);
            }
                else if (input==2){
                    System.out.println("Please enter integer number to define if it is even or odd and press Enter");
                    int a = scn.nextInt();
                    defineEvenOrOdd(a);
                }
                else{
                    System.out.println("Please enter first integer number below");
                    int a=scn.nextInt();
                    System.out.println("Please enter second integer number below");
                    int b=scn.nextInt();
                    defineBigger(a,b);
                }
        else
            System.out.println("Wrong input, use only 1, 2, or 3");






    }
}

