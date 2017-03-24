package com.ganzina.app.homework.lesson4;

import java.util.Scanner;

/**
 * Created by Ievgeniia on 3/24/2017.
 */
public class BiggerNumber {
    public static int defineBigger(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter first integer number below");
        int a=scanner.nextInt();

        System.out.println("Please enter second integer number below");
        int b=scanner.nextInt();

        if (a==b){
            System.out.println("Numbers are equal");
            return a;}
        else
            if (a>b){
                System.out.println(a+" is bigger");
                return a;}

                else{
                System.out.println(b+" is bigger");
                return b;}



    }
}
