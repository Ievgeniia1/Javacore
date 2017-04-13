package com.ganzina.app.homework.lesson6;

/**
 * Created by Ievgeniia on 4/11/2017.
 */
public class ArrayHomework {
    public void arrayEven (){
        int k=2;
        int [] array = new int [10];
        for (int i=0;i<array.length;i++){
            array[i]=k;
            k+=2;
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int i=0;i<array.length;i++) {
            System.out.println(array[i]);

        }

    }
    public void arrayOdd(){
        int [] oddArray = new int [50];
        int k=1;
        for (int i=0;i<oddArray.length;i++){
                    oddArray[i]=k;
                    k+=2;
                    System.out.print(oddArray[i]+" ");
                }
        System.out.println();

        for (int i=oddArray.length-1;i>=0;i--){
            System.out.print(oddArray[i]+" ");
        }

            }
    public void randomArray (){
        int [] array = new int[15];
        int counter=0;
        for (int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*10);
            if (array[i]%2==0){
                counter++;
            }
            System.out.print(array[i]+" ");
        }

        System.out.println();
        System.out.println("Number of even elements equals: "+counter);
    }
    public  void arrayMinMaxElement (){
        int[] array = new int[15];


        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
            System.out.print(array[i] + " ");
        }

        int min=array[0];
        int max=array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }

            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println();
        System.out.println("Minimum: "+min);
        System.out.println("Maximum: "+max);
    }
    public static void multiArray() {
        int[][] array = new int[8][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random()*90+10);
            }

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();

        }
    }
    }

