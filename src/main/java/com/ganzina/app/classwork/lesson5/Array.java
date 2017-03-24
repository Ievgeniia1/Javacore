package com.ganzina.app.classwork.lesson5;

/**
 * Created by Ievgeniia on 3/24/2017.
 */
public class Array {
    public void firstArray() {
        int[] arrayInt = new int[2];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        System.out.println(arrayInt);
        for (int arrayPos : arrayInt) {
            System.out.println(arrayPos);
        }


        int [] newArray = {2,4,6};
        for (int Place:newArray){
            System.out.println(Place);
        }



    }
}
