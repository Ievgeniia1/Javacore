package com.ganzina.app.classwork.lesson15;

/**
 * Created by Ievgeniia on 5/5/2017.
 */
public class Chicago extends AbstractHouse {


    public Chicago(String name) {
        super(name);
    }

    @Override
    public void build() {
        System.out.println("Build Chicago house");
        showHouseNumber("137");
    }
}
