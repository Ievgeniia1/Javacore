package com.ganzina.app.homework.lesson8;

/**
 * Created by Ievgeniia on 4/19/2017.
 */
public class BubbleSort {
    public  int[] sortAsc(int [] array){
       for (int i=0;i<array.length;i++){
            for(int j=0; j<array.length-1;j++){
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }

        return array;
    }

    public  int[] sortDesc(int [] array1){
        for (int i=0;i<array1.length;i++){
            for(int j=0; j<array1.length-1;j++){
                if (array1[j]<array1[j+1]){
                    int temp=array1[j];
                    array1[j]=array1[j+1];
                    array1[j+1]=temp;
                }
            }
        }

        return array1;
    }
}
