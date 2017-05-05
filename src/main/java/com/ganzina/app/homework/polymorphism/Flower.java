package com.ganzina.app.homework.polymorphism;

import java.util.Scanner;

/**
 * Created by Ievgeniia on 5/5/2017.
 */
public class Flower {
    //parent class

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int numberOfFlowers(){
        System.out.println("How much flowers do you want?");
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        return num;
    }
}
