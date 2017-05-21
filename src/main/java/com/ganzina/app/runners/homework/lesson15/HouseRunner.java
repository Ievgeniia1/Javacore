package com.ganzina.app.runners.homework.lesson15;

import com.ganzina.app.homework.lesson15.Bed;
import com.ganzina.app.homework.lesson15.Flat;
import com.ganzina.app.homework.lesson15.House;
import com.ganzina.app.homework.lesson15.Fridge;

/**
 * Created by Ievgeniia on 5/21/2017.
 */
public class HouseRunner {
    public static void main(String[] args) {
        String name="Nice flat";
        String bedName="Cool bed";
        String refName="Side-by-side";

        Flat flat = new Flat(name);
        House house = new House(flat);

        Bed bed = new Bed();
        bed.setName(bedName);

        Fridge fridge = new Fridge();
        fridge.setName(refName);

        flat.setBed(bed);
        flat.setFridge(fridge);

        System.out.println("House always has a flat named: "+house.getFlat().getName()+". And flat may have a bed named: " +
                house.getFlat().getBed().getName()+", and fridge named: "+house.getFlat().getFridge().getName());

    }
}
