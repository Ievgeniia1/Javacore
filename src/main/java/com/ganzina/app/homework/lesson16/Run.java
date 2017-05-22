package com.ganzina.app.homework.lesson16;

/**
 * Created by Ievgeniia on 5/18/2017.
 */

/*Задание А:
Создать интерфейс Run, для описания транспорта. Интерфейс должен иметь в себе следующие методы:
Метод вывода имени транспортного средства
Метод получения скорости передвижения транспорта
Метод получения массы транспорта
Метод получения количества пасажиров
Метод получения количества колес транспорта
*/
public interface Run {
    String showName();
    int getSpeed();
    int getMass();
    int getNumberPass();
    int wheelsNumber();
}
