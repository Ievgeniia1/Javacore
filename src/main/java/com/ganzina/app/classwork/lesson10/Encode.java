package com.ganzina.app.classwork.lesson10;

/**
 * Created by Ievgeniia on 4/11/2017.
 */
public class Encode {
    public static String stringEncode(String newStringToEncode) {
        String plainText = "012345";
        String cypherText = "ABCDEF";
        StringBuilder myBuilder = new StringBuilder(newStringToEncode);
        String encodedString = " ";

        for (int i = 0; i < myBuilder.length(); i++) {
            for (int j = 0; j < plainText.length(); j++) {
                if (myBuilder.charAt(i) == plainText.charAt(j)) {
                    myBuilder.setCharAt(i, cypherText.charAt(j));
                    break;
                }

            }
        }
    return myBuilder.toString();
    }

}
