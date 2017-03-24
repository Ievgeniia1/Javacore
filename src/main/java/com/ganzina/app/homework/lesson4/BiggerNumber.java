package com.ganzina.app.homework.lesson4;

import java.util.Scanner;

/**
 * Created by Ievgeniia on 3/24/2017.
 */
public class BiggerNumber {
    public static int defineBigger(int a, int b){
        int max;


        if (a==b){

            System.out.println("Numbers are equal");
            max=a;

        }
        else
            if (a>b){
                System.out.println(a+" is bigger");
                max= a;}

                else{
                System.out.println(b+" is bigger");
                max= b;}

                return max;
    }
}
