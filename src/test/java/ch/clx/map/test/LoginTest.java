package ch.clx.map.test;

import ch.clx.map.LoginPage;
import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class LoginTest extends BaseTest {

    LoginPage lp;


    @BeforeTest
    public void setup() throws MalformedURLException {
        super.setup();
        lp = new LoginPage(driver);
    }

    @Test
    public void testLogin() throws InterruptedException {
//        Thread.sleep(5000);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.widget.ListView/android.view.View[2]/android.widget.Button").click();
//        Thread.sleep(5000);
        driver.findElement(By.id("loginUsernameInput")).sendKeys("1121061509");
        driver.findElement(By.id("passwordInput")).sendKeys("Appium123");
        driver.findElement(By.id("smlSubmit")).click();
        Thread.sleep(20000);
    }

    @AfterTest
    public void tearDown() {
        super.tearDown();
    }

}
