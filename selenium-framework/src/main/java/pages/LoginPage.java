package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	//locators
	private By emailBox = By.xpath("//input[@id='username']");
	private By passwordBox = By.xpath("//input[@id='password']");
	private By signInButton = By.xpath("//button[@id='organic-div']/form/div[3]/button");
	
	//constructor
	public LoginPage(WebDriver driver) {
		this.driver =driver;
		
	}
	
	public void enterUsername(String username) {
		driver.findElement(emailBox).sendKeys("jaswanthyallanti@gmail.com");
		
	}
	public void enterPassword(String password) {
		driver.findElement(passwordBox).sendKeys("jaswanth@1234");
		
	}
	
	public void clickSignin() {
		driver.findElement(signInButton).click();
	}
	

}
