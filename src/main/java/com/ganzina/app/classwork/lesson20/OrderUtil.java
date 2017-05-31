package com.ganzina.app.classwork.lesson20;

/**
 * Created by evgeniya on 30.05.2017.
 */
public class OrderUtil {
    public static <K,V> boolean compare (Pair <K,V> p1, Pair<K,V>p2){
       return p1.getKey().equals(p2.getKey())&&
               p1.getValue().equals(p2.getValue());


    }

    public static <K> boolean compare (Compare<K> c1, Compare <K> c2){
        return  c1.getKey().equals(c2.getKey());
    }
}
