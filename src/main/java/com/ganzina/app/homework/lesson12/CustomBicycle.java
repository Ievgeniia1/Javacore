package com.ganzina.app.homework.lesson12;

/**
 * Created by Ievgeniia on 5/21/2017.
 *
 Написать класс CustomBicycle который будет наследовать Bicycle и
 имплементировать классы setSpeed() и setGear(), которые будут сохранять данные
 в поля класса int speed и int gear, после чего выводить соответствующие значения на экран.
 */
public class CustomBicycle extends Bicycle {
    int speed;
    int gear;

    @Override
    public void ride(){
        System.out.println("Wshhh!");
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Speed is: "+speed);
    }

    @Override
    public void setGear(int gear) {
        this.gear = gear;
        System.out.println("Gear set: "+gear);
    }


    }

