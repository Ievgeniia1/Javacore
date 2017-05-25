package com.ganzina.app.runners.lesson10;

import com.ganzina.app.classwork.lesson10.Encode;

import java.util.Scanner;

/**
 * Created by Ievgeniia on 4/11/2017.
 */
public  class EncodeRunner {
    public static void main(String[] args) {
        System.out.println("Enter any two digits and press Enter");
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();

        Encode object = new Encode();
        object.stringEncode(input);

        System.out.println(object.stringEncode(input));
    }
}
