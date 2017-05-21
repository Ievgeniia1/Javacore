package com.ganzina.app.homework.lesson13;

/**
 * Created by Ievgeniia on 5/18/2017.

 Написать класс Human который имеет только один конструктор (конструктор должен быть с параметрами,
 принимающий на входе возраст и имя человека). Поля возраст и имя должны быть приватными,
 а в классе должны быть реализованы геттеры getName(), getAge() и сеттер setAge (int age)
 который проверяет что возраст человека находится в диапазоне 1..120 лет, и в зависимости от этого
 выводит сообщение “New age setted” и сохраняет значение в поле возраста, или выводит сообщение
 “Age invalid” (если возраст не входит в диапазон).

 */


public class Human {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.setAge(age);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ((age>=1)&&(age<=120)){
        this.age = age;
            System.out.println("New age set");
        }
        else {
            System.out.println("Invalid age");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


