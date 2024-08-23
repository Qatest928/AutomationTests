package testcase;
import base.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pagefactory.LandingPage;
import utilities.PropertiesConfig;

import java.util.Properties;

public class MyFirstTest {

    WebDriver driver;
    DriverFactory driverFactory;
    LandingPage landingPage;

    @BeforeSuite
    public void beforeSuite() {
    driverFactory = new DriverFactory();
    this.driver =  driverFactory.GetDriver(PropertiesConfig.getConfig());
    }

    @Test
    public void testMethod1() throws InterruptedException {
        landingPage = new LandingPage(driver);
        landingPage.CloseButton();
        landingPage.OneWayFlightSearch();
        String title =  driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Challenge Validation", title);
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }
}
