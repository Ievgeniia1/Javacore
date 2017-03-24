package com.ganzina.app.runners.lesson4;

import com.ganzina.app.classwork.lesson4.Car;

/**
 * Created by Ievgeniia on 3/17/2017.
 */
public class CarRunner {
    public static void main(String[] args) {
        Car lexus = new Car ();
        lexus.name ="h300";
        Car toyota = new Car ();
        toyota.name = "corolla";
        System.out.println(lexus.name+" "+Car.wheelCounter);
        System.out.println(toyota.name+" "+Car.wheelCounter);
        Car.wheelCounter=8;
        System.out.println(Car.wheelCounter);
        Car.driver();

        Car.numberOfSeats=5;
        System.out.println("Number of seats = "+Car.numberOfSeats);
        Car.sound();

        //Car.CONST=5;
        System.out.println("Constanta = "+Car.CONST);

    }
}
