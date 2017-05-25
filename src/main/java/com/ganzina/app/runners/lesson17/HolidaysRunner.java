package com.ganzina.app.runners.lesson17;

import com.ganzina.app.classwork.lesson17.Holidays;

/**
 * Created by Ievgeniia on 5/16/2017.
 */
public class HolidaysRunner {
    public static void main(String[] args) {
        for (Holidays holiday: Holidays.values()) {
            System.out.println(holiday.getNameOfHoliday()+" holiday is on "+holiday.getMonth()+", "+holiday.getDate());

        }
    }
}
