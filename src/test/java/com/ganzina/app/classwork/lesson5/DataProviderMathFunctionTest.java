package com.ganzina.app.classwork.lesson5;

import com.ganzina.app.classwork.lesson3.MathFunc;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Ievgeniia on 3/21/2017.
 */
@RunWith(JUnitParamsRunner.class)
public class DataProviderMathFunctionTest {
    @Test
    @FileParameters(value = "src/test/resources/TestData.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestMultiply(int argA, int argB, int expOut) {
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(expOut, mathFunc.multiply(argA, argB));
    }

    @Test
    @FileParameters(value = "src/test/resources/TestData1.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestSum(int argA, int argB, int expOut) {
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(expOut, mathFunc.sum(argA, argB));
    }
}
