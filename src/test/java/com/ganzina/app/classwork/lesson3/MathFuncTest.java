package com.ganzina.app.classwork.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Ievgeniia on 3/15/2017.
 */
public class MathFuncTest {
    @Test
    public void multiplyTest(){
    int a = 1;
    int b = 2;
    MathFunc mathFunc = new MathFunc();
    mathFunc.multiply(a,b);
    int actualResult = mathFunc.multiply(a,b);
    int expectedResult = 2;
    Assert.assertEquals(expectedResult,actualResult);

    }
    @Test
    public void sumTest(){
        int c=5;
        int d=3;
        MathFunc mathFunc = new MathFunc();
        mathFunc.sum(c,d);
        int actualResult = mathFunc.sum(c,d);
        int expectedResult = 8;
        Assert.assertEquals(expectedResult,actualResult);
    }
}
