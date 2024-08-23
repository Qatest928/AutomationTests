package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesConfig {
    public static String browserChrome;

    public static String getConfig(){
        Properties properties = new Properties();
        try (FileInputStream input = new FileInputStream("src/test/resources/configuration/configurationsettings.properties")) {
            properties.load(input);
            browserChrome = properties.getProperty("browser.chrome");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return browserChrome;
    }
}
