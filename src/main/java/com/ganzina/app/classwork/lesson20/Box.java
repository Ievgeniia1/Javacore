package com.ganzina.app.classwork.lesson20;

/**
 * Created by evgeniya on 30.05.2017.
 */
public class Box <T extends Number> {
    private T obj;

    public Box(T obj) {
        this.obj = obj;
    }


    public <U extends Pair> U inspect (U u) { //extends Pair дает возможность использоваать метод getKey из parent class
        System.out.println(u.getKey());
        return u;
    }



}
