package com.ganzina.app.classwork.lesson3;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by Ievgeniia on 3/15/2017.
 */
public class MathFuncTest {

    @Test
    public void multiplyTest(){
    int a = 1;
    int b = 2;
    int expectedResult = 2;
    Assert.assertEquals(expectedResult,MathFunc.multiply(a,b));

    }
    @Test
    public void sumTest(){
        int a = 1;
        int b = 2;
        int expectedResult = 3;
        Assert.assertEquals(expectedResult,MathFunc.sum(a,b));

    }


}

