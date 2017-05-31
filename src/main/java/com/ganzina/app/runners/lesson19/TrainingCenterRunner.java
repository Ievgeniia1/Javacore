package com.ganzina.app.runners.lesson19;

import com.ganzina.app.classwork.lesson19.TrainingCenter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by evgeniya on 26.05.2017.
 */
public class TrainingCenterRunner {
    public static void main(String[] args) {

        TrainingCenter kit = new TrainingCenter();
        kit.name="KIT";

        TrainingCenter bio = new TrainingCenter();
        bio.name="BIO";

        TrainingCenter abc = new TrainingCenter();
        abc.name="ABC";

        TrainingCenter uml = new TrainingCenter();
        uml.name="UML";

        //Добавить пару тр центров, добавить map и вывести через foreach

        Map <TrainingCenter, Integer> map = new HashMap(32);
        map.put(kit,13);
        map.put(bio,12);
        map.put(abc,18);
        map.put(uml,3456);

        System.out.println(map);

        System.out.println(map.entrySet());

       for (Map.Entry<TrainingCenter,Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
