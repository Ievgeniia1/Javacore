package com.ganzina.app.utils.coverters;

/**
 * Created by Ievgeniia on 3/17/2017.
 */
public class PrimitiveConvertor {
    float float1=65.0f;
    int int1=79;
    char char2='e';

    public void floatToChar(){
        char char1=(char)float1;
        System.out.println("Input float value is " + float1 + ". Output char value is '" + char1+"'");
    }

    public void intToChar() {
        char char1=(char)int1;
        System.out.println("Input int value is " + int1 + ". Output char value is '" + char1+"'");

    }

    public void charToInt(){
        int int2=(int)char2;
        System.out.println("Input char value is '" + char2 +"'"+ ". Output int value is " + int2);

    }


}
