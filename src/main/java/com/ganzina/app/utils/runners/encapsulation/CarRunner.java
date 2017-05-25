package com.ganzina.app.utils.runners.encapsulation;

import com.ganzina.app.classwork.encapsulation.Car;

/**
 * Created by Ievgeniia on 5/4/2017.
 */
public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car();
//        car.name = "";
//        car.getName();
        car.setName("BMW");
        System.out.println(car.getName());
    }
}
