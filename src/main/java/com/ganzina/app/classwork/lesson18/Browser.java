package com.ganzina.app.classwork.lesson18;

/**
 * Created by Ievgeniia on 5/23/2017.
 */
public class Browser {
private String name;
private int version;

    public void invoke(String name){
        System.out.println(name);
    }

    public void invoke(String name,int version){ //overloading - метод с одинаковым названием, но разным кол-вом парамаетров
        invoke(name);
        System.out.println(" "+version);
    }





}
