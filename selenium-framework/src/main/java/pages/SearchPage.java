package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class SearchPage {

private WebDriver driver;


	
	//locators
    private By Selectmovie = By.xpath("//div[text()='Court: State vs A Nobody']");
   // private By bookTicket = By.xpath("//span[text()='Book tickets']");
    private By selectDate = By.xpath("//div[@id='20250324']/div[2]");
    private By selectTime = By.xpath("//div[@id='super-container']/div[1]/div[4]/div/div/section[2]/div/div[1]/section/div/div/div[2]/div[2]/div[1]/div[1]/div");
    private By noSeats = By.xpath("//li[@id='pop_2']");
    private By selectSeats = By.xpath("//div[@id='proceed-Qty']");
    private By selectedSeats = By.xpath("//a[@id='B_4_16']");
    private By payButton = By.xpath("//a[@id='btmcntbook']");
    private By termcon = By.xpath("//div[@id='btnPopupAccept']");
    private By probutton = By.xpath("//div[@id='prePay']");
    private By Emailbox = By.xpath("//input[@id='txtEmail']");
    private By numbox = By.xpath("//input[@id='txtMobile']");
    private By conbutton = By.xpath("//a[@id='dContinueContactSec']");



	private WebDriverWait wait;



	private SoftAssert softAssert;
	
//constructor
	public SearchPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.softAssert = new SoftAssert();
    }

    public void selectMovie() throws InterruptedException {
        softAssert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(Selectmovie)).isDisplayed(), "Movie selection is not visible");
        Thread.sleep(1000);  
        driver.findElement(Selectmovie).click();
    }

    public void selectDate() throws InterruptedException {
        softAssert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(selectDate)).isDisplayed(), "Date selection is not visible");
        Thread.sleep(1000);  
        driver.findElement(selectDate).click();
    }

    public void selectTime() throws InterruptedException {
        softAssert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(selectTime)).isDisplayed(), "Time selection is not visible");
        Thread.sleep(1000);
        driver.findElement(selectTime).click();
    }

    public void selectSeats() throws InterruptedException {
        softAssert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(selectSeats)).isDisplayed(), "Seat selection is not visible");
        Thread.sleep(2000);  
        driver.findElement(selectSeats).click();
    }

    public void acceptTerms() throws InterruptedException {
        softAssert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(termcon)).isDisplayed(), "Terms and Conditions not visible");
        Thread.sleep(500);
        driver.findElement(termcon).click();
    }

    public void proceedToPayment() throws InterruptedException {
        softAssert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(probutton)).isDisplayed(), "Proceed button is not visible");
        Thread.sleep(2000);
        driver.findElement(probutton).click();
    }

    public void enterEmail(String email) throws InterruptedException {
        softAssert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(Emailbox)).isDisplayed(), "Email input field is not visible");
        Thread.sleep(500);
        driver.findElement(Emailbox).sendKeys(email);
    }

    public void enterNumber(String number) throws InterruptedException {
        softAssert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(numbox)).isDisplayed(), "Mobile number input field is not visible");
        Thread.sleep(500);
        driver.findElement(numbox).sendKeys(number);
    }

    public void clickContinue() throws InterruptedException {
        softAssert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(conbutton)).isDisplayed(), "Continue button is not visible");
        Thread.sleep(1000);
        driver.findElement(conbutton).click();
    }

	
		
	}

	
	
	