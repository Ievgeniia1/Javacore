package com.ganzina.app.classwork.polymorphism;

/**
 * Created by Ievgeniia on 5/4/2017.
 */
public class HP extends Computer {
    public void changeRAM(){
        System.out.println("Changing HP RAM memory");
    }

    public void changeToSSD(){
        System.out.println("Changing HP SSD");
    }

    public void changeCPU(){
        System.out.println("Changing HP CPU");
    }
}
