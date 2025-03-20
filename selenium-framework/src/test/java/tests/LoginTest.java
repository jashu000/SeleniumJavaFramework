package tests;

import org.testng.annotations.Test;

import base.baseTest;
import pages.LoginPage;

public class LoginTest extends baseTest {
	
	@Test
	public void testValidLogin() {
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername("jaswanthyallanti@gmail.com");
		loginPage.enterPassword("jaswanth@1234");
		loginPage.clickSignin();
	}

}
