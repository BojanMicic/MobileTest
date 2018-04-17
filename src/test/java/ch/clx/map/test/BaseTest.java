package ch.clx.map.test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    AppiumDriver driver;

    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Galaxy J7");
//        caps.setCapability("deviceName", "Galaxy S5");
//        caps.setCapability("udid", "52dab11a");
        caps.setCapability("udid", "5203c319ee2e635b");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "6.0.1");
//        caps.setCapability("platformVersion", "7.0");
        caps.setCapability("appPackage", "com.crealogix.mdb.master.test");
        caps.setCapability("appActivity", "ch.clx.map.mdb.MainActivity");
        caps.setCapability("noReset", "true");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}



