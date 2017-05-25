package com.ganzina.app.runners.lesson7;

import java.util.Arrays;

/**
 * Created by Ievgeniia on 4/14/2017.
 */
public class ArraySortRunner {
    public static void main(String[] args) {
        int [] array = {16,15,8,2};
        int temp;
        for (int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1;j++){
                if (array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }

            }
        }
        System.out.println("Sorted Array: "+Arrays.toString(array));

    }
}

