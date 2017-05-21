package com.ganzina.app.homework.lesson15;

/**
 * Created by Ievgeniia on 5/21/2017.
 */
public class FootballClub extends SportsClub {
    @Override
    public void wins(int wins) {
        System.out.println("Wins number: "+wins);

    }

    @Override
    public void draws(int draws) {
        System.out.println("Draws number: "+draws);

    }

    @Override
    public void defeats(int defeats) {
        System.out.println("Defeats number: "+defeats);

    }
}
