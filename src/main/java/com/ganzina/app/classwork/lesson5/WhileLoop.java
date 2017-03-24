package com.ganzina.app.classwork.lesson5;

import java.util.Scanner;

/**
 * Created by Ievgeniia on 3/24/2017.
 */
public class WhileLoop {

    public void Loop(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter first number ");
        int a = scn.nextInt();
        System.out.println("Please enter second number ");
        int b = scn.nextInt();
        if (a>b) {
            while (a > b) {
                a = a - 1;
                System.out.println("a = " + a + ", b= " + b);
            }

        }

        else {
            System.out.println("a = " + a + ", b= " + b);
            System.exit(1);
        }
        }
}
