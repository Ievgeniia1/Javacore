package com.ganzina.app.classwork.lesson5;

/**
 * Created by Ievgeniia on 3/24/2017.
 */
public class CountEven {
    int counter=0;
    public void evenNumbers (){
        for (int i=0; i<=20; i++){
            if (i%2==0) {
                System.out.println(i+" is even number");
                counter++;
            }
        }
        System.out.println("Number of even numbers equals: "+counter);
    }
    }
