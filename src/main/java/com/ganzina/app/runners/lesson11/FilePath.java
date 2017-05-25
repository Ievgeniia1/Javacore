package com.ganzina.app.runners.lesson11;

import java.io.File;

/**
 * Created by Ievgeniia on 4/21/2017.
 */
public class FilePath {
    public static void main(String[] args) {
        String currentDir = System.getProperty ("user.dir");
        String osName = System.getProperty("os.name");
        String testPropertiesLinuxStyle = "src/test/resources/test.properties";
        String testPropertiesWindowsStyle = "src\\test\\resources\\test.properties";
        System.out.println(currentDir);
        System.out.println(osName);
        if (osName.toLowerCase().contains("win")){
            File file = new File(currentDir,testPropertiesWindowsStyle);
            System.out.println(file.getAbsolutePath());
        }
        else {
            File file = new File(currentDir,testPropertiesLinuxStyle);
            System.out.println(file.getAbsolutePath());
        }
    }
}
