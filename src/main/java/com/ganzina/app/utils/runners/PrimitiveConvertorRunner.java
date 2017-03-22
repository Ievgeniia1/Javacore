package com.ganzina.app.utils.runners;

import com.ganzina.app.utils.convertors.PrimitiveConvertor;

/**
 * Created by Ievgeniia on 3/22/2017.
 */
public class PrimitiveConvertorRunner {
    public static void main(String[] args) {
        PrimitiveConvertor name = new PrimitiveConvertor();
        name.floatToChar();
        name.intToChar();
        name.charToInt();

    }

    }
