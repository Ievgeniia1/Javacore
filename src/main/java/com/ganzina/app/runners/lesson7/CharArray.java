package com.ganzina.app.runners.lesson7;

import java.util.Arrays;

/**
 * Created by Ievgeniia on 4/14/2017.
 */
public class CharArray {
    public static void main(String[] args) {
        char [] array = new char[256];

        for (int i =0; i<array.length;i++){
            array[i]=(char)i;
        }
        System.out.println(Arrays.toString(array));
    }
}
