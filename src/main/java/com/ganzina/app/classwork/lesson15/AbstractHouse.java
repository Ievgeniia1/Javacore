package com.ganzina.app.classwork.lesson15;

/**
 * Created by Ievgeniia on 5/5/2017.
 */
public abstract class AbstractHouse {

    private String name;

    public AbstractHouse(String name) {
        this.name = name;
    }

    public abstract void build();

    public void showHouseNumber(String number){
        System.out.println("Number "+number);
    }
}
