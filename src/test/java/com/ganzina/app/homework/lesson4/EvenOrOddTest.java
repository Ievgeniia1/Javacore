package com.ganzina.app.homework.lesson4;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Ievgeniia on 3/24/2017.
 */



@RunWith(JUnitParamsRunner.class)
public class EvenOrOddTest {
    @Test
    @FileParameters(value = "src/test/resources/TestEvenOdd.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestEvenOdd(int a, boolean expRes) {
        boolean actRes=EvenOrOdd.defineEvenOrOdd(a);
        Assert.assertEquals(expRes,actRes);
    }
}
