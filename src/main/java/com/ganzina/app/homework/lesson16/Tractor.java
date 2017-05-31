package com.ganzina.app.homework.lesson16;

/**
 * Created by Ievgeniia on 5/18/2017.

 Задание В:
 Создать супер класс "Трактор" который унаследует абстрактный класс Machine. От заданного супер класса
 создать двух прямых потомков "Колесный" и "Гусеничный". Потомки должны реализовывать все методы, какие
 нереализованные в абстрактном классе. Данные методы должны выводить на экран информацию о транспорте.
 */
public abstract class Tractor extends Machine{


    private int speed;
    private int mass;
    private int passengers;
    private int wheels;

    public Tractor(String name, int currentSpeed, int speed, int mass, int passengers, int wheels) {
        super(name, currentSpeed);
        this.speed = speed;
        this.mass = mass;
        this.passengers = passengers;
        this.wheels = wheels;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
