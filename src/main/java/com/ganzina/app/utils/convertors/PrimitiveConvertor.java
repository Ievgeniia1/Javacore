package com.ganzina.app.utils.convertors;

/**
 * Created by Ievgeniia on 3/22/2017.
 */
public class PrimitiveConvertor {


    public static char floatToChar(float float1){
        char char1=(char)float1;
        System.out.println("Input float value is " + float1 + ". Output char value is '" + char1+"'");
        return char1;
    }

    public static char intToChar(int int1) {
        char char1=(char)int1;
        System.out.println("Input int value is " + int1 + ". Output char value is '" + char1+"'");
        return char1;
    }

    public static int charToInt(char char2){
        int int2=(int)char2;
        System.out.println("Input char value is '" + char2 +"'"+ ". Output int value is " + int2);
        return int2;
    }

}
