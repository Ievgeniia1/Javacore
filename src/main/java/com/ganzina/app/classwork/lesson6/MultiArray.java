package com.ganzina.app.classwork.lesson6;

import java.util.Arrays;

/**
 * Created by Ievgeniia on 3/28/2017.
 */
public class MultiArray {
    public void multiArray(){
        int [][] intArray = new int [2][3];
        for (int j=0;j<intArray.length;j++ ){
            for (int k=0; k<intArray[j].length;k++){
                intArray[j][k] =j*k;
            }
        }

        for (int j=0;j<intArray.length;j++ ){
            for (int k=0; k<intArray[j].length;k++){
                System.out.print(intArray[j][k]);
            }
        }
        }
        }


