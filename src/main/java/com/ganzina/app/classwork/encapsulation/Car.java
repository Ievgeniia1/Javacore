package com.ganzina.app.classwork.encapsulation;

/**
 * Created by Ievgeniia on 5/4/2017.
 */
public class Car {
    private String  name= "Car";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void shiftCarGear(){
        System.out.println(name);
    }
}
