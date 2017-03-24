package com.ganzina.app.homework.lesson4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Ievgeniia on 3/24/2017.
 */
public class EvenOrOddTest {
    @Test
    public void naturalOddTest(){
        int a=3;
        boolean actRes=EvenOrOdd.defineEvenOrOdd(a);
        boolean expRes=false;
        Assert.assertEquals(expRes,actRes);
    }

    @Test
    public void naturalEvenTest(){
        int a=2;
        boolean actRes=EvenOrOdd.defineEvenOrOdd(a);
        boolean expRes=true;
        Assert.assertEquals(expRes,actRes);
    }

    @Test
    public void zeroTest(){
        int a=0;
        boolean actRes=EvenOrOdd.defineEvenOrOdd(a);
        boolean expRes=true;
        Assert.assertEquals(expRes,actRes);
    }
    @Test
    public void twoSymbolsTest(){
        int a=99;
        boolean actRes=EvenOrOdd.defineEvenOrOdd(a);
        boolean expRes=false;
        Assert.assertEquals(expRes,actRes);
    }

    @Test
    public void thousandTest(){
        int a=1000;
        boolean actRes=EvenOrOdd.defineEvenOrOdd(a);
        boolean expRes=true;
        Assert.assertEquals(expRes,actRes);
    }
}
