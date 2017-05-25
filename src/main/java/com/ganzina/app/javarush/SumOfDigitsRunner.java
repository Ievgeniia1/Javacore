package com.ganzina.app.javarush;

/**
 * Created by Ievgeniia on 5/21/2017.
 */
public class SumOfDigitsRunner{
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(1234));

    }

    public static int sumDigitsInNumber(int number){
        int sum = 0;
       while (number>0){
           sum+=number%10;
           number/=10;
       }
        return sum;
    }

}
