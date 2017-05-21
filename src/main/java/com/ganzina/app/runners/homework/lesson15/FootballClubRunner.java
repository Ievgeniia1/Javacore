package com.ganzina.app.runners.homework.lesson15;

import com.ganzina.app.homework.lesson15.FootballClub;

/**
 * Created by Ievgeniia on 5/21/2017.
 */
public class FootballClubRunner {
    public static void main(String[] args) {
        FootballClub footballClub = new FootballClub();
        String location = "Kyiv";
        String name="Best club";
        int wins = 2;
        int draws = 5;
        int defeats = 1;



        footballClub.showLocation(location);
        footballClub.showName(name);
        footballClub.showStatistics(wins,draws,defeats);

        footballClub.wins(wins);
        footballClub.draws(draws);
        footballClub.defeats(defeats);
    }
}
