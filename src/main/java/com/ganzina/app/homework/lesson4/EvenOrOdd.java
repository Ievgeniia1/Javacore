package com.ganzina.app.homework.lesson4;

import java.util.Scanner;

/**
 * Created by Ievgeniia on 3/24/2017.
 */
public class EvenOrOdd {
    public static int defineEvenOrOdd() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number to define if it is even or odd and press Enter");
        int a = scanner.nextInt();

        if (a%2==0){
            System.out.println(a+" is even");
            return a;}
        else{
            System.out.println(a+" is odd");
            return a;}
    }
}