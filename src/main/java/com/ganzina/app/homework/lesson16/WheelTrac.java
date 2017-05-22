package com.ganzina.app.homework.lesson16;

/**
 * Created by Ievgeniia on 5/18/2017.
 */
public class WheelTrac extends Tractor {

    public WheelTrac(String name, int currentSpeed, int speed, int mass, int passengers, int wheels) {
        super(name, currentSpeed, speed, mass, passengers, wheels);
    }

    @Override
    public int getNumberPass() {
        return getPassengers();
    }

    @Override
    public int wheelsNumber() {
        return getWheels();
    }
}
