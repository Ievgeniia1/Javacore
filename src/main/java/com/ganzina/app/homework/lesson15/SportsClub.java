package com.ganzina.app.homework.lesson15;

/**
 * Created by Ievgeniia on 5/21/2017.


Task 1. Design and implement classes SportsClub (abstract class), FootballClub.SportsClub should include showName(),
        showLocation, showStatistic()  and hold information about name of the club, its location and various statistics
        about the club. FootballClub should include statistics such as how many wins, draws and defeats( wins(), draws(),
        defeats() - abstracts methods should be defined, in SportsClub)
        (Implement abstract methods in SportsClub and override in FootballClub).*/
public abstract class SportsClub {
    private String name;
    private String location;
    private int wins;
    private int draws;
    private int defeats;

    public void showName(String name) {
        this.name=name;
        System.out.println(name);
    }

    public void showLocation(String location){
        this.location=location;
        System.out.println(location);
    }

    public void showStatistics(int wins,int draws,int defeats){
        setWins(wins);
        setDraws(draws);
        setDefeats(defeats);
        System.out.println("Statistic. Number of wins is: "+getWins()+", draws is: "+getDraws()+", defeats is: "+getDefeats());
    }


    abstract void wins(int wins);
    abstract void draws(int draws);
    abstract void defeats(int defeats);


    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getWins() {
        return wins;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

}

