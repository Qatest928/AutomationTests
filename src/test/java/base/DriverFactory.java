package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {

    public WebDriver driver;

    public WebDriver GetDriver(String BrowserType) {


        try {
            // Chrome Driver Handler
            if (BrowserType.equals("Chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                // Create a new instance of ChromeDriver
                driver.get("https://www.goibibo.com/");
                driver.manage().window().maximize();

                //Edge Driver Handler
            } else if (BrowserType.equals("Edge")) {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                // Create a new instance of ChromeDriver
                driver.get("https://www.goibibo.com/");
                driver.manage().window().maximize();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return driver;
    }
}
