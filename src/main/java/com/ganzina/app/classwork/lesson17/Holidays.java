package com.ganzina.app.classwork.lesson17;

/**
 * Created by Ievgeniia on 5/16/2017.
 */
public enum Holidays {
    NEW_YEAR("New Year",1,"January"), INDEPENDENCE_DAY("Independence Day", 24, "August"), CHRISTMAS("Christmas", 7, "January");
    public String nameOfHoliday;
    private int date;
    private String month;


    Holidays(String nameOfHoliday, int date, String month) {
        this.nameOfHoliday = nameOfHoliday;
        this.date = date;
        this.month = month;
    }

    public String getNameOfHoliday() {
        return nameOfHoliday;
    }

    public int getDate() {
        return date;
    }

    public String getMonth() {
        return month;
    }
}

