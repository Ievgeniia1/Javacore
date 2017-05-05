package com.ganzina.app.classwork.polymorphism;

/**
 * Created by Ievgeniia on 5/4/2017.
 */
public class IBM extends Computer {
    public void changeRAM(){
        System.out.println("Changing IBM RAM memory");
    }

    public void changeToSSD(){
        System.out.println("Changing IBM SSD");
    }

     public void changeOnlyIBM(){
        System.out.println("Changing only IBM");
    }

    public void changeCPU(){
        System.out.println("Changing IBM CPU");
    }
}
