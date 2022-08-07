package testrkgrp.testrkaid.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReaderUtil {
    public static Properties auto = new Properties();

    public static void readProperties() {
        auto = new Properties();
        try {
            FileInputStream objFile = new FileInputStream("C:\\Users\\USER\\Documents\\BDD-master\\BDD-master\\src\\test\\java\\resources\\application.properties");
            auto.load(objFile);
        } catch (IOException e) {
            e.printStackTrace();
            throw  new IllegalStateException("Unable to read file");
        }
    }

}
