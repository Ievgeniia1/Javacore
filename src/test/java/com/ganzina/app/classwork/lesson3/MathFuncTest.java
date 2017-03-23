package com.ganzina.app.classwork.lesson3;

import com.ganzina.app.utils.convertors.PrimitiveConvertor;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by Ievgeniia on 3/15/2017.
 */
public class MathFuncTest {

    @Test
    public void multiplyTest() {
        int a = 1;
        int b = 2;
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, MathFunc.multiply(a, b));

    }

    @Test
    public void sumTest() {
        int a = 1;
        int b = 2;
        int expectedResult = 3;
        Assert.assertEquals(expectedResult, MathFunc.sum(a, b));

    }

    @Test
    public void absTest() {
        int a = -5;
        int expRes = 5;
        Assert.assertEquals(expRes, Math.abs(a)); //shows absolute value of number
    }

    @Test
    public void roundTest() {
        float a = 5.25f;
        int expRes = 5;
        Assert.assertEquals(expRes, Math.round(a));

    }


    @Test
    public void sqrtTest() {
        int a = 16;
        int expRes = 4;
        Assert.assertEquals(expRes, Math.sqrt(a), 2);
    }

    @Test
    public void cbrtTest(){
        int a=81;
        int expRes=3;
        Assert.assertEquals(expRes,Math.cbrt(a),2);
    }

    @Test
    public void addExact(){
        long a=299999L;
        long b=1L;
        long expRes=300000L;
        Assert.assertEquals(expRes,Math.addExact(a,b));
    }

    @Test
    public void floorTest(){
        double a=1.2d;
        double expRes=1.0d;
        Assert.assertEquals(expRes, Math.floor(a),0);
    }

    @Test
    public void ceilTest(){
        double a=12.34d;
        double expRes=13d;
        Assert.assertEquals(expRes,Math.ceil(a),2);
    }


    @Test
    public void assertEqualsTest() {
        int a = 100;
        int b = 99;
        int expRes = 1;
        Assert.assertEquals(expRes, Math.subtractExact(a, b));
    }

    @Test
    public void substractTest() {
        int a = 2;
        int b = 5;
        int expRes = -3;
        Assert.assertEquals(expRes, Math.subtractExact(a, b));
    }

    @Test
    public void maxTest() {
        int a = 6;
        int b = 2;
        int expRes = 6;
        Assert.assertEquals(expRes, Math.max(a, b));
    }

    @Test
    public void minTest() {
        float a = 2.05f;
        float b = -5.08f;
        float expRes = -5.08f;
        Assert.assertEquals(expRes, Math.min(a, b), 2);
    }

    @Test
    public void addExactTest() {
        int a = 5;
        int b = 7;
        int expRes = 12;
        Assert.assertEquals(expRes, Math.addExact(a, b));
    }

    @Test
    public void decrementExactTest(){
        int a=8;
        int expRes=7;
        Assert.assertEquals(expRes,Math.decrementExact(a));
    }

    @Test
    public void incrementExactTest(){
        int a=99;
        int expRes=100;
        Assert.assertEquals(expRes,Math.incrementExact(a));
    }

    @Test
    public void negateExactTest(){
        int a=99;
        int expRes=-99;
        Assert.assertEquals(expRes,Math.negateExact(a));
    }

    @Test
    public void toIntExactTest(){
        long b=214748364L;
        int expRes=214748364;
        Assert.assertEquals(expRes,Math.toIntExact(b));
    }

    @Test
    public void MathETest(){
        float expRes=2.71f;
        Assert.assertEquals(expRes,Math.E, 2);
    }



    @Test
    public void floatToCharTest(){
        char expRes='A';
        PrimitiveConvertor method=new PrimitiveConvertor();
        Assert.assertEquals(expRes,method.floatToChar());
    }


    @Test
    public void intToCharTest(){
        char expRes='O';
        PrimitiveConvertor method=new PrimitiveConvertor();
        Assert.assertEquals(expRes,method.intToChar());
    }

    @Test
    public void charToInt(){
        int expRes=101;
        PrimitiveConvertor method = new PrimitiveConvertor();
        Assert.assertEquals(expRes,method.charToInt());
    }


}
