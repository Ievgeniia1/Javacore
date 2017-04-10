package com.ganzina.app.classwork.lesson4;

/**
 * Created by Ievgeniia on 3/17/2017.
 */
public class CircleArea {

    public static final double PI =3.14d;
    public static double area1, area2;


    public static void calculateBigger(int r1,int r2) {
        area1=PI*r1*r1;
        area2=PI*r2*r2;
        if (area1>area2)
            System.out.println("Area1 is bigger and equals "+area1);
        else
            if (area1==area2)
                System.out.println("Areas are the same and each one equals "+area1);
        else
            System.out.println("Area2 is bigger and equals "+area2);

    }
}
