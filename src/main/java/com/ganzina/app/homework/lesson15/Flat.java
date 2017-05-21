package com.ganzina.app.homework.lesson15;

/**
 * Created by Ievgeniia on 5/21/2017.
 */
public class Flat {
    private String name;
    private Bed bed;
    private Fridge fridge;

    public Flat(String name) { //composition
        this.name = name;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fridge getFridge() {
        return fridge;
    }

    public void setFridge(Fridge fridge) {
        this.fridge = fridge;
    }
}
