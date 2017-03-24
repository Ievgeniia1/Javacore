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
public class RightAngleTriangleTest {
    @Test
    @FileParameters(value = "src/test/resources/TestTriangle.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestRealRightAngleTriangle(int a, int b, int c, String expRes) {

        String actRes=RightAngleTriangle.validateTriangle(a,b,c);
        Assert.assertEquals(expRes,actRes);
    }

}
