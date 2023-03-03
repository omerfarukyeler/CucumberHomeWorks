package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;

    static {//ilk çalışan yerdir.Bu yüzden "configuration.properties" in pathini buraya attık .

        String path = "configuration.properties";
        try {
            FileInputStream fis = new FileInputStream(path);//bulamama ihtimaline karşı try catch attık.excel data açmak için açtık.
            properties = new Properties();
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){//metod statik olduğu için nesne oluşturmadık.

        return properties.getProperty(key);
    }
}
