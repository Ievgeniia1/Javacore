package com.ganzina.app.classwork.lesson20;

/**
 * Created by evgeniya on 30.05.2017.
 */
public class BoxPrinterGeneric<T> {

    private T val;

    public BoxPrinterGeneric(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    @Override
    public String toString() {
        return "BoxPrinterGeneric{" +
                "val=" + val +
                '}';
    }
}
