package com.ganzina.app.homework.polymorphism;

import java.util.Scanner;

/**
 * Created by Ievgeniia on 5/5/2017.
 */
public class Peony extends Flower {
    public int numberOfFlowers(){
        System.out.println("How much peonies do you want?");
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        return num;
    }
}
