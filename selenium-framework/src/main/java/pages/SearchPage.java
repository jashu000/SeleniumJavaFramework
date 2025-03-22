package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

private WebDriver driver;
private WebDriverWait wait;
	
	//locators
    private By Selectmovie = By.xpath("//div[text()='Court: State vs A Nobody']");
    private By bookTicket = By.xpath("//span[text()='Book tickets']");
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
//constructor
	public SearchPage(WebDriver driver) {
		this.driver =driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}
	
	public void Moviename() {
	driver.findElement(Selectmovie).click();
	}
	public void bookNow() {
		driver.findElement(bookTicket).click();
	}
	
	public void date() {
	driver.findElement(selectDate).click();	
	}
	public void time() {
		driver.findElement(selectTime).click();	
	}
	public void seats() {
		driver.findElement(noSeats).click();	
	}
	
	public void seating() {
		driver.findElement(selectSeats).click();	
	}
	public void twoseats() {
		driver.findElement(selectedSeats).click();	
	}
	public void terms() {
		driver.findElement(termcon).click();	
	}
	public void proceed() {
		driver.findElement(probutton).click();	
	}
	public void email(String username) {
		driver.findElement(Emailbox).sendKeys(username);	
	}
	public void number(String number) {
		driver.findElement(numbox).sendKeys(number);	
	}
	public void contButton() {
		driver.findElement(conbutton).click();
	}
}
