package com.ganzina.app.runners.lesson18;

import java.util.*;

/**
 * Created by Ievgeniia on 5/23/2017.
 */
public class CollectionRunner {
    public static void main(String[] args) {
        String bmw ="BWM";
        String audi = "AUDI";
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(bmw);
        arrayList.add(audi);
        System.out.println(arrayList);

        Map map = new HashMap<>();
        map.put("KIT",13);
        map.put("Ciklum",15);
        Set entries=map.entrySet();
        System.out.println(entries);
        Set keys = map.keySet();
        System.out.println(keys);
        System.out.println(map.containsKey("Ciklum"));
        System.out.println(map.containsValue(13));


    }
}
