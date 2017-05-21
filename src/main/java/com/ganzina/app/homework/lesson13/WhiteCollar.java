package com.ganzina.app.homework.lesson13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ievgeniia on 5/18/2017.


 Реализовать класс WhiteCollar, который наследует Human
 и в конструкторе принимает значения возраста, имени и компании,
 при этом вызывая родительский конструктор для сохранения в приватные поля имени и возраста.


 Реализовать сеттер setCompany (String string),
 который сохраняет в поле companyName введенное значение,
 если оно состоит только из латинских символов, тире, пробела и/или запятых.
 В противном случае выводится сообщение “Company name is invalid”.

 */

public class WhiteCollar extends Human {
    private String company;
    public WhiteCollar(int age, String name, String company) {
        super(age, name);
        this.setCompany(company);
    }

    public void setCompany(String company) {

        String allowedSymbols ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz,- ";
        char [] charSymbols = allowedSymbols.toCharArray();
        char [] charCompany = company.toCharArray();
        int counter=0;
        for (char companyPosition:charCompany ) {

            for (char symbolsPosition:charSymbols) {
                if (companyPosition==symbolsPosition){
                    counter++;
                }

            }
        }

        if (counter==charCompany.length){
            this.company=company;
        }

        else {
            System.out.println("Company name is not valid");
        }


        }


    public String getCompany() {
        return company;
    }
}
