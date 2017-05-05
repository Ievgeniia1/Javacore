package com.ganzina.app.runners.homework.polymorphism;

import com.ganzina.app.homework.polymorphism.*;

/**
 * Created by Ievgeniia on 5/5/2017.
 */
public class FlowerRunner {
    public static void main(String[] args) {
        Flower rose = new Rose();
        Flower carnation = new Carnation();
        Flower tulip = new Tulip();
        Flower peony = new Peony();

        rose.setPrice(20);
        carnation.setPrice(5);
        tulip.setPrice(10);
        peony.setPrice(15);

        Flower [] flower = new Flower [4];
        flower[0]=rose;
        flower[1]=carnation;
        flower[2]=tulip;
        flower[3]=peony;

        System.out.println("Price of your bouquet is : "+ costOfBouquet(flower));

    }


    public static double costOfBouquet(Flower [] flower){
        double costOfBouquet=0;
        for (Flower arrayPos:flower) {
            double cost = arrayPos.numberOfFlowers()*arrayPos.getPrice();
            costOfBouquet+=cost;
        }
        return costOfBouquet;

    }

}

