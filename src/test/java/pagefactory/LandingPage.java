package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class LandingPage {

    WebDriver driver;

    public LandingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='logSprite icClose' and @role='presentation']")
    private WebElement closeButton;

    @FindBy(xpath = "//div[@class='sc-12foipm-2 eTBlJr fswFld ' and @style='width: 260px;']")
    private WebElement fromSearchTextClick;

    @FindBy(xpath = "//body/div[@id='root']/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/input[1]")
    private WebElement fromSearchText;

    @FindBy(xpath = "//span[contains(text(),'Dhaka, Bangladesh')]")
    private WebElement selectFromDestination;

    @FindBy(xpath = "//body/div[@id='root']/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/input[1]")
    private WebElement toSearchText;

    @FindBy(xpath = "//span[contains(text(),'New York, United States')]")
    private WebElement selectToDestination;

    @FindBy(xpath = "//p[contains(text(),'Friday')]")
    private WebElement departureDate;

    @FindBy(xpath = "(//p[@class='fsw__date' and contains(text(), 23)])[1]")
    private WebElement selectDepartureDate;

    @FindBy(xpath = "//p[contains(text(), 'Click to add a return flight for better discounts')]")
    private WebElement returnDate;

    @FindBy(xpath = "//span[@class='sc-12foipm-8 eXKWBG fswDownArrow']")
    private WebElement secondClickReturnDate;

    @FindBy(xpath = "//div[@class='DayPicker-Day' and @aria-label='Sat Sep 14 2024']")
    private WebElement selectReturnDate;

    @FindBy(xpath = "//div[@aria-label='Sat Sep 14 2024']")
    private WebElement clickReturnDate;

    @FindBy(xpath = "//span[contains(text(), 'SEARCH FLIGHTS')]")
    private WebElement clickOnSearch;


    public void CloseButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOf(closeButton));
        closeButton.click();
    }

    public void OneWayFlightSearch() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        fromSearchTextClick.click();
        wait.until(ExpectedConditions.visibilityOf(fromSearchText));
        fromSearchText.sendKeys("Dhaka");

        wait.until(ExpectedConditions.elementToBeClickable(selectFromDestination));
        selectFromDestination.click();

        wait.until(ExpectedConditions.visibilityOf(toSearchText));
        toSearchText.sendKeys("New york");

        wait.until(ExpectedConditions.elementToBeClickable(selectToDestination));
        selectToDestination.click();

        wait.until(ExpectedConditions.elementToBeClickable(departureDate));
        departureDate.click();

        wait.until(ExpectedConditions.elementToBeClickable(selectDepartureDate));
        selectDepartureDate.click();

        wait.until(ExpectedConditions.elementToBeClickable(returnDate));
        returnDate.click();

        wait.until(ExpectedConditions.elementToBeClickable(secondClickReturnDate));
        secondClickReturnDate.click();

        wait.until(ExpectedConditions.elementToBeClickable(selectReturnDate));
        selectReturnDate.click();

        wait.until(ExpectedConditions.elementToBeClickable(clickReturnDate));
        clickReturnDate.click();

        wait.until(ExpectedConditions.elementToBeClickable(clickOnSearch));
        clickOnSearch.click();


    }
}
