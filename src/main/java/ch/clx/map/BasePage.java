package ch.clx.map;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public abstract class BasePage {
    AppiumDriver driver;

    protected static Properties locators;

    public BasePage (AppiumDriver driverPage) {
        this.driver = driverPage;
    }

    public static Properties loadProperties(String propertiesLocation) { //This method is for reading Property files with locators. Ako na zadatoj putanji ne postoji property file koji hocemo da procitamo onda ce metoda vratiti gresku "Something went wrong..."

        InputStream propertiesFile;
        Properties properties = new Properties();
        try {
            propertiesFile = new FileInputStream(propertiesLocation);
            properties.load(propertiesFile);
            propertiesFile.close();
        }catch(FileNotFoundException e) {
            final String message = "Something went wrong while trying to load properties from: " + propertiesLocation;
            throw new RuntimeException(message, e);
        }catch(IOException e){
            final String message = "Something went wrong while trying to load properties from: " + propertiesLocation;
            throw new RuntimeException(message, e);
        }
        return properties;
    }

    public Properties getLocators() {
        return locators = loadProperties("src/main/resources/locators.properties");
    }
}
