package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseTest2;
import pages.SearchPage;

public class bookMyShowTest extends BaseTest2 {
    private WebDriver driver;
    private SearchPage searchPage;
    private SoftAssert softAssert;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Update with correct path
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://example.com"); // Update with actual website URL
        searchPage = new SearchPage(driver);
        softAssert = new SoftAssert();
    }

    @Test(priority = 1)
    public void testMovieSelection() throws InterruptedException {
        searchPage.selectMovie();
        // Add validation (Example: Check if redirected correctly)
        softAssert.assertTrue(driver.getCurrentUrl().contains("movie"), "Movie selection failed!");
    }

    @Test(priority = 2)
    public void testDateSelection() throws InterruptedException {
        searchPage.selectDate();
        // Validate date is selected
        softAssert.assertTrue(driver.getPageSource().contains("20250324"), "Date selection failed!");
    }

    @Test(priority = 3)
    public void testTimeSelection() throws InterruptedException {
        searchPage.selectTime();
        softAssert.assertTrue(driver.getPageSource().contains("time"), "Time selection failed!");
    }

    @Test(priority = 4)
    public void testSeatSelection() throws InterruptedException {
        searchPage.selectSeats();
        softAssert.assertTrue(driver.getPageSource().contains("seat"), "Seat selection failed!");
    }

    @Test(priority = 5)
    public void testTermsAcceptance() throws InterruptedException {
        searchPage.acceptTerms();
        softAssert.assertTrue(driver.getPageSource().contains("accepted"), "Terms and conditions not accepted!");
    }

    @Test(priority = 6)
    public void testProceedToPayment() throws InterruptedException {
        searchPage.proceedToPayment();
        softAssert.assertTrue(driver.getCurrentUrl().contains("payment"), "Proceed to payment failed!");
    }

    @Test(priority = 7)
    public void testEmailInput() throws InterruptedException {
        searchPage.enterEmail("test@example.com");
        softAssert.assertTrue(driver.getPageSource().contains("test@example.com"), "Email input failed!");
    }

    @Test(priority = 8)
    public void testMobileNumberInput() throws InterruptedException {
        searchPage.enterNumber("9876543210");
        softAssert.assertTrue(driver.getPageSource().contains("9876543210"), "Mobile number input failed!");
    }

    @Test(priority = 9)
    public void testContinueButton() throws InterruptedException {
        searchPage.clickContinue();
        softAssert.assertTrue(driver.getCurrentUrl().contains("confirmation"), "Continue button failed!");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}