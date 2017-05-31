package com.ganzina.app.classwork.lesson20;

/**
 * Created by evgeniya on 30.05.2017.
 */
public class CompareData <K> implements Compare {

    private K key;


    @Override
    public K getKey() {
        return key;
    }

    public CompareData(K key) {
        this.key = key;
    }


}
