package com.ganzina.app.homework.lesson4;

import com.ganzina.app.utils.convertors.PrimitiveConvertor;
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
public class PrimitiveConvertorTest {
    @Test
    @FileParameters(value = "src/test/resources/TestFloatToChar.csv",mapper = CsvWithHeaderMapper.class)
    public void floatToCharTest (float a,char expRes){
        char actRes=PrimitiveConvertor.floatToChar(a);
        Assert.assertEquals(expRes,actRes);

    }

    @Test
    @FileParameters(value = "src/test/resources/TestIntToChar.csv",mapper = CsvWithHeaderMapper.class)
    public void intToCharTest (int a,char expRes){
        char actRes=PrimitiveConvertor.intToChar(a);
        Assert.assertEquals(expRes,actRes);

    }


    @Test
    @FileParameters(value = "src/test/resources/TestCharToInt.csv",mapper = CsvWithHeaderMapper.class)
    public void CharToIntTest (char a,int expRes){
        int actRes=PrimitiveConvertor.charToInt(a);
        Assert.assertEquals(expRes,actRes);

    }

}
