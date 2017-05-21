package com.ganzina.app.runners.homework.lesson13;

import com.ganzina.app.homework.lesson13.WhiteCollar;

/**
 * Created by Ievgeniia on 5/18/2017.
 */
public class HumanRunner {
    public static void main(String[] args) {
        //Object with valid age and name
        int valid_age=45;
        String name = "James";
        String valid_company = "CDP, ISE-IHS, and OIL";

        WhiteCollar whiteCollar = new WhiteCollar(valid_age,name,valid_company);
        System.out.println("Name: "+whiteCollar.getName()+"\nAge: "+whiteCollar.getAge()+
                "\nCompany: "+whiteCollar.getCompany());
        System.out.println();

        //Object with invalid age and name
        int invalid_age=145;
        String name2 = "John Snow";
        String invalid_company = "*$%CDP, ISE-IHS, and OIL";

        WhiteCollar whiteCollar2 = new WhiteCollar(invalid_age,name2,invalid_company);

        System.out.println("Name: "+whiteCollar2.getName()+"\nAge: "+whiteCollar2.getAge()+
                "\nCompany: "+whiteCollar2.getCompany());

    }
}
