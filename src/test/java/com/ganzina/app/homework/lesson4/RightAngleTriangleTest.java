package com.ganzina.app.homework.lesson4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Ievgeniia on 3/24/2017.
 */
public class RightAngleTriangleTest {
    @Test
    public void realRightAngleTriangleTest() {
        int a=3;
        int b=4;
        int c=5;
        String  expRes="Your triangle is right-angled";
        String actRes=RightAngleTriangle.validateTriangle(a,b,c);
        Assert.assertEquals(expRes,actRes);
    }

    @Test
    public void realWithHipotenuzaFirstTest() {
        int a=17;
        int b=8;
        int c=15;
        String  expRes="Your triangle is right-angled";
        String actRes=RightAngleTriangle.validateTriangle(a,b,c);
        Assert.assertEquals(expRes,actRes);
    }

    @Test
    public void realWithHipotenuzaSecondTest() {
        int a=12;
        int b=13;
        int c=5;
        String  expRes="Your triangle is right-angled";
        String actRes=RightAngleTriangle.validateTriangle(a,b,c);
        Assert.assertEquals(expRes,actRes);
    }


    @Test
    public void invalidTriangleTest() {
        int a=1;
        int b=2;
        int c=10;
        String  expRes="Such triangle does not exist";
        String actRes=RightAngleTriangle.validateTriangle(a,b,c);
        Assert.assertEquals(expRes,actRes);
    }

    @Test
    public void invalidTriangleZeroTest() {
        int a=0;
        int b=2;
        int c=10;
        String  expRes="Such triangle does not exist";
        String actRes=RightAngleTriangle.validateTriangle(a,b,c);
        Assert.assertEquals(expRes,actRes);
    }

    @Test
    public void invalidAllZerosTest() {
        int a=0;
        int b=0;
        int c=0;
        String  expRes="Such triangle does not exist";
        String actRes=RightAngleTriangle.validateTriangle(a,b,c);
        Assert.assertEquals(expRes,actRes);
    }

    @Test
    public void invalidNegativeTest() {
        int a=-5;
        int b=-5;
        int c=-5;
        String  expRes="Such triangle does not exist";
        String actRes=RightAngleTriangle.validateTriangle(a,b,c);
        Assert.assertEquals(expRes,actRes);
    }

    @Test
    public void notRightAngledTriangleTest() {
        int a=2;
        int b=2;
        int c=2;
        String  expRes="Your triangle is not right-angled";
        String actRes=RightAngleTriangle.validateTriangle(a,b,c);
        Assert.assertEquals(expRes,actRes);
    }

}
