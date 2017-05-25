package com.ganzina.app.runners.lesson18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by Ievgeniia on 5/23/2017.
 */
public class IntegerArrayListRunner {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Integer int1 = 12;
        Integer int2 = 5;
        arrayList.add(int1);
        arrayList.add(int2);
        System.out.println(arrayList);
        System.out.println(arrayList.contains(5)); //true
        System.out.println(arrayList.indexOf(int2));//1
        System.out.println(arrayList.get(1));//5
        System.out.println(arrayList.size());//2
        System.out.println(arrayList.isEmpty()); //false
        arrayList.remove(int1);
        System.out.println(arrayList);//12
        arrayList.remove(0);
        System.out.println(arrayList);


        HashSet hs = new HashSet();

        hs.add("B");
        hs.add("A");
        hs.add("A");
        hs.add(10);
        System.out.println(hs);

        Map m1 = new HashMap();
        m1.put("Zara","8");
        m1.put("Mahnaz","31");
        m1.put("Ayan","12");
        m1.put("Daisy","14");

        System.out.println(m1.get("Zara"));
        System.out.println(m1.get("Mahnaz"));
        System.out.println(m1.get("Ayan"));
        System.out.println(m1.get("Daisy"));

        System.out.println(m1);
    }
}
