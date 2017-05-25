package com.ganzina.app.homework;

/**
 * Created by Ievgeniia on 4/21/2017.
 */
public class Bicycle {
    public String wheelSize;
    public String color;
    public int speed;
    public int price;

    public Bicycle (String color){
        this.color = color;
        this.speed=10;
    }

    public Bicycle(String color, String wheelSize){
        this(color);
        this.wheelSize=wheelSize;

    }

    public Bicycle (String color, String wheelSize, int speed, int price){
       //  this(color);
        this(color, wheelSize);//number of params has to be the same as in parent constructor;
        this.speed=speed;
        this.price=price;

    }



}
