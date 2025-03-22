package tests;

import org.testng.annotations.Test;

import base.BaseTest2;
import pages.SearchPage;

public class bookMyShowTest extends BaseTest2  {

	@Test
	public void testlogin() {
		SearchPage searchPage = new SearchPage(driver);
		searchPage.Moviename();
		
		searchPage.bookNow();
		searchPage.date();
		searchPage.time();
		searchPage.seats();
		searchPage.seating();
		searchPage.twoseats();
		searchPage.terms();
		searchPage.proceed();
		searchPage.email("jaswanthyallanti@gmail.com");
		searchPage.number("7013245305");
		searchPage.contButton();
	}
}

