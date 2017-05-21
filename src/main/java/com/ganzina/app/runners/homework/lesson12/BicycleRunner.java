package com.ganzina.app.runners.homework.lesson12;

import com.ganzina.app.homework.lesson12.Bicycle;
import com.ganzina.app.homework.lesson12.BicycleWithRing;
import com.ganzina.app.homework.lesson12.BicycleWithRingInterface;
import com.ganzina.app.homework.lesson12.CustomBicycle;

/**
 * Created by Ievgeniia on 5/21/2017.
 */
public class BicycleRunner {
    public static void main(String[] args) {
        //Вызвать метод ring() из обьекта класса BicycleWithRing через референс типа BicycleWithRingInterface.
        BicycleWithRingInterface bicycleWithRingInterface = new BicycleWithRing();
        bicycleWithRingInterface.ring();
        System.out.println();


        //Вызвать методы setGear() и ride() из обьекта класса CustomBicycle через референс класса
        // Bicycle. В классе CustomBicycle метод ride() должен выводить на экран строку “Wshhhh!”.

        Bicycle bicycle = new CustomBicycle();
        bicycle.setGear(9);
        bicycle.setSpeed(25);
        bicycle.ride();

    }
}
