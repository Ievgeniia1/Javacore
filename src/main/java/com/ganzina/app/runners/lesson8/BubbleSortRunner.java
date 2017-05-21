package com.ganzina.app.runners.lesson8;

import com.ganzina.app.homework.lesson8.ArrayPrint;
import com.ganzina.app.homework.lesson8.BubbleSort;

import java.util.Arrays;

/**
 * Created by Ievgeniia on 4/19/2017.
 */
public class BubbleSortRunner {
    public static void main(String[] args) {
        int [] newArray = {0,1,25,98,3};
        System.out.println("Original array: "+ Arrays.toString(newArray));
        BubbleSort object = new BubbleSort();

        int [] ascSortedArray = object.sortAsc(newArray);
        System.out.print("Sorted array from low to high:");
        ArrayPrint.arrayPrint(ascSortedArray);

        int [] descSortedArray = object.sortDesc(newArray);
        System.out.print("Sorted array from high to low:");
        ArrayPrint.arrayPrint(descSortedArray);

    }
}
