package com.ganzina.app.runners.lesson17;

import com.ganzina.app.classwork.lesson17.Season;

import java.util.Arrays;

/**
 * Created by Ievgeniia on 5/16/2017.
 */
public class SeasonRunner {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        if (season == Season.SPRING){
            season =Season.SUMMER;

        }
        System.out.println(season.name());
        System.out.println(Season.AUTUMN.name());
        Season season1 = Season.valueOf("SPRING"); // valueOf - from String to immutable object
        System.out.println(Arrays.toString(Season.values()));
    }
}
