package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties properties;

    // this method will read any property file
    public static Properties readProperties(String filePath) {
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    // this method retrieves single value based on the specified key
    public static String getPropertyValue(String key){
        return properties.getProperty(key);
    }

}
