package com.ganzina.app.runners.lesson17;

import com.ganzina.app.classwork.lesson17.Company;

/**
 * Created by Ievgeniia on 5/16/2017.
 */
public class CompanyRunner {

    public static void main(String[] args) {
        for (Company arrayPosition: Company.values()) {
            System.out.println("Company Value: "+arrayPosition.getValue()+" - Company Name: "+arrayPosition);

        }
    }
}
