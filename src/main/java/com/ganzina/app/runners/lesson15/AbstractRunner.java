package com.ganzina.app.runners.lesson15;

import com.ganzina.app.classwork.lesson15.AbstractHouse;
import com.ganzina.app.classwork.lesson15.ObolonResidence;

/**
 * Created by Ievgeniia on 5/5/2017.
 */
public class AbstractRunner {
    public static void main(String[] args) {

        String name="name";
        String number="15a";

        AbstractHouse obolonResidence = new ObolonResidence(name);
        obolonResidence.build();
        obolonResidence.showHouseNumber(number);
        //объект нового класса и вызвать build

//        AbstractHouse abstractHouse = new AbstractHouse() {   //анонимный класс
//            @Override
//            public void build() {
//
//            }
        }

}
