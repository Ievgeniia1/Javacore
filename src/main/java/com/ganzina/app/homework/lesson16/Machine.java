package com.ganzina.app.homework.lesson16;

/**
 * Created by Ievgeniia on 5/18/2017.
 */
/*Задание Б:
Создать абстрактный класс Machine, который реализует интерфейс Run. В данном классе реализовать:
Константу максимальной скорости
Константу минимальной скорости
Константу минимального количества пассажиров
Константу максимального количества пассажиров
Поле с названием транспорта
Поле со скоростью передвижения транспорта в данный момент времени
Конструктор класса Mаshinе (String name, int speed)
Метод вывода имени транспорта
*/
public abstract class  Machine implements Run{
    public final static int MAXSPEED=200;
    public final static int MINSPEED=10;
    public final static int MINNUMBERPASS=1;
    public final static int MAXNUMBERPASS=5;
    private String name;
    private int currentSpeed;

    public Machine(String name, int currentSpeed) {
        this.name = name;
        this.currentSpeed = currentSpeed;
    }

    public String showName(){
    return name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}