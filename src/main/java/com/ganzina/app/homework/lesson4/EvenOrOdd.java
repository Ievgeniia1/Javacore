package com.ganzina.app.homework.lesson4;

import java.util.Scanner;

/**
 * Created by Ievgeniia on 3/24/2017.
 */
public class EvenOrOdd {
    public static boolean defineEvenOrOdd(int a) {
        boolean isEven;

        if (a%2==0){
            System.out.println(a+" is even");
            isEven=true;
            return isEven;}
        else{
            System.out.println(a+" is odd");
            isEven=false;
            return isEven;}
    }
}