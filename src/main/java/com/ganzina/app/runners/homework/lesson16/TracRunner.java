package com.ganzina.app.runners.lesson16;

import com.ganzina.app.homework.lesson16.CrawlerTrac;
import com.ganzina.app.homework.lesson16.Run;
import com.ganzina.app.homework.lesson16.Tractor;
import com.ganzina.app.homework.lesson16.WheelTrac;

/**
 * Created by Ievgeniia on 5/19/2017.
 */
public class TracRunner {
    public static void main(String[] args) {

        Tractor wheelTrac = new WheelTrac("Wheeled",100,120,5640,4,4);
        Tractor crawlerTrac = new CrawlerTrac("Crawled",40,50,8600,2,0);


        System.out.println("Tractor with name \""+wheelTrac.showName()+"\" has speed "+wheelTrac.getSpeed()+" and mass "
                +wheelTrac.getMass()+", and "+wheelTrac.getNumberPass()+" max passengers allowed. Number of wheels is: "
                +wheelTrac.wheelsNumber());

        System.out.println("Tractor with name \""+crawlerTrac.showName()+"\" has speed "+crawlerTrac.getSpeed()+" and mass "
                +crawlerTrac.getMass()+", and "+crawlerTrac.getNumberPass()+" max passengers allowed. Number of wheels is: "
                +crawlerTrac.wheelsNumber());
    }
}
