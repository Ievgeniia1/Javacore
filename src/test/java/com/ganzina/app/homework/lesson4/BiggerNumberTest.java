package com.ganzina.app.homework.lesson4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Ievgeniia on 3/24/2017.
 */
public class BiggerNumberTest {
    @Test
    public void firstTest(){
        int a=3;
        int b=0;
        int actRes=BiggerNumber.defineBigger(a,b);
        int expRes=3;
        Assert.assertEquals(expRes,actRes);
    }

    @Test
    public void secondTest(){
        int a=2;
        int b=8;
        int actRes=BiggerNumber.defineBigger(a,b);
        int expRes=8;
        Assert.assertEquals(expRes,actRes);
    }

    @Test
    public void thirdTest(){
        int a=-3;
        int b=-8;
        int actRes=BiggerNumber.defineBigger(a,b);
        int expRes=-3;
        Assert.assertEquals(expRes,actRes);
    }

    @Test
    public void fourthTest(){
        int a=0;
        int b=-99;
        int actRes=BiggerNumber.defineBigger(a,b);
        int expRes=0;
        Assert.assertEquals(expRes,actRes);

    }



}
