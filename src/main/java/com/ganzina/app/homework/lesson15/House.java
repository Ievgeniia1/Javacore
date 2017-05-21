package com.ganzina.app.homework.lesson15;

/**
 * Created by Ievgeniia on 5/21/2017.
 *
 Task 2 Composition and Aggregation
 1. Create class House with flat (class Flat)
 2. Buy new things to your sweet home and put into a flat
 Try to define where we use Composition and Aggregation

 */
public class House {
    private  Flat flat;

    public House(Flat flat) { //composition
        this.flat = flat;
    }

    public Flat getFlat() {
        return flat;
    }

    public void setFlat(Flat flat) {
        this.flat = flat;
    }
}
