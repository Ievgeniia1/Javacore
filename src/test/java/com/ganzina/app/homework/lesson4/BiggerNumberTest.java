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
public class BiggerNumberTest {
    @Test
    @FileParameters(value = "src/test/resources/TestBigger.csv", mapper = CsvWithHeaderMapper.class)
        public void dataProviderTestBigger(int a, int b, int expRes)         {
            int actRes=BiggerNumber.defineBigger(a,b);
            Assert.assertEquals(expRes,actRes);
        }
    }
