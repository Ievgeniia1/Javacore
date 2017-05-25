package com.ganzina.app.runners.lesson11;

import com.ganzina.app.homework.Bicycle;

import javax.sound.midi.Soundbank;
import java.util.logging.SocketHandler;

/**
 * Created by Ievgeniia on 4/21/2017.
 */
public class BicycleRunner {
    public static void main(String[] args) {
        String color="red";
        String wheelSize="10";
        int speed = 250;
        int price = 500;
        Bicycle bicycle = new Bicycle(color);
        Bicycle bicycle1 = new Bicycle(color,wheelSize);
        //Bicycle with 4 params
        Bicycle bicycle2 = new Bicycle(color, wheelSize,speed,price);

        System.out.println(bicycle.color);
        System.out.println("Bicycle 2 colour: "+bicycle1.color+" Size: "+bicycle1.wheelSize);

        System.out.println();
        System.out.println("Bicycle with 4 parameters");
        System.out.println("Colour: "+bicycle2.color);
        System.out.println("Wheel size: "+bicycle2.wheelSize);
        System.out.println("Speed: "+bicycle2.speed);
        System.out.println("Price: "+bicycle2.price);
                //+bicycle2.color+" "+bicycle2.wheelSize+" "+bicycle2.speed+" "+bicycle2.price);
    }
}
