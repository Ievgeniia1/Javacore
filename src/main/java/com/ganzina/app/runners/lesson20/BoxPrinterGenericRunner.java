package com.ganzina.app.runners.lesson20;


import com.ganzina.app.classwork.lesson20.BoxPrinter;
import com.ganzina.app.classwork.lesson20.BoxPrinterGeneric;

/**
 * Created by evgeniya on 30.05.2017.
 */
public class BoxPrinterGenericRunner {
    public static void main(String[] args) {
        BoxPrinterGeneric<Integer> boxPrinterGeneric = new BoxPrinterGeneric<>(10);
        Integer integer = boxPrinterGeneric.getVal();
        BoxPrinterGeneric<String> boxPrinterGeneric1 = new BoxPrinterGeneric<>("Hello World");
        //Integer integer2 = (Integer)boxPrinterGeneric1.getVal(); - compile error, cannot cast Integer to String
        String value = boxPrinterGeneric1.getVal();

        BoxPrinterGeneric<Long> boxPrinterGeneric2 = new BoxPrinterGeneric<>(12L);
        Long value2 = boxPrinterGeneric2.getVal();




    }
}
