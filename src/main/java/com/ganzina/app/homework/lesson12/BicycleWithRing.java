package com.ganzina.app.homework.lesson12;

/**
 * Created by Ievgeniia on 5/21/2017.
 *
 * Написать класс BicycleWithRing, который будет наследовать класс
 * CustomBicycle и имплементировать интерфейс BicycleWithRingInterface.
 * Метод ring() должен выводить на экран строку “Di-ling!”
 */
public class BicycleWithRing extends CustomBicycle implements BicycleWithRingInterface {
    @Override
    public void ring() {
        System.out.println("Di-ling!");
    }


}
