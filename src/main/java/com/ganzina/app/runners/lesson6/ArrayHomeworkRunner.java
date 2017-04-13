package com.ganzina.app.runners.lesson6;

import com.ganzina.app.homework.lesson6.ArrayHomework;

/**
 * Created by Ievgeniia on 4/11/2017.
 */
public class ArrayHomeworkRunner {
    public static void main(String[] args) {

        ArrayHomework object = new ArrayHomework();

        System.out.println();
        System.out.println("Homework 6. Task a:");
        object.arrayEven();

        System.out.println();
        System.out.println("Homework 6. Task b:");
        object.arrayOdd();

        System.out.println();
        System.out.println();
        System.out.println("Homework 6. Task c:");
        object.randomArray();

        System.out.println();
        System.out.println("Homework 6. Task d:");
        object.arrayMinMaxElement();

        System.out.println();
        System.out.println("Homework 6. Task e:");
        object.multiArray();

    }

}
