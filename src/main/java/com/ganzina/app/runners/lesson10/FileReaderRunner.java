package com.ganzina.app.runners.lesson10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Ievgeniia on 4/11/2017.
 */
public class FileReaderRunner {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("E:\\input2.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);

            }
            reader.close();
        }   catch (FileNotFoundException e) {
            e.printStackTrace();
        }   catch (IOException e) {
            e.printStackTrace();
        }   finally {
            System.out.println("Anyway see this");

        }
    }
}

