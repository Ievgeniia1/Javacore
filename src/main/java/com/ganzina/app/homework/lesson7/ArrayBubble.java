package com.ganzina.app.homework.lesson7;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ievgeniia on 4/19/2017.
 */
public class ArrayBubble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int [5];
       for (int i=0; i<array.length;i++){
            System.out.println("Enter array element");
            array[i]=input.nextInt();
        }

        for (int i=0;i<array.length;i++){
            for(int j=0; j<array.length-1;j++){
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

        for (int i=0;i<array.length;i++){
            for(int j=0; j<array.length-1;j++){
                if (array[j]<array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

