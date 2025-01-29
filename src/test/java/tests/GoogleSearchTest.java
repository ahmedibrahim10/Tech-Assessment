package tests;

import Utilities.ScreenShotUtility;
import base.TestBase;
import io.qameta.allure.Allure;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GoogleSearchPage;

import java.io.IOException;


/**
 * Test class to validate Google search functionality.
 */
public class GoogleSearchTest extends TestBase {

    @Test (priority = 1)
    public void testGoogleSearch() throws IOException {
        // Navigate to Google
        driver.get("https://www.google.com/ncr");

        // Create a page object
        GoogleSearchPage googlePage = new GoogleSearchPage(driver);

        // Perform search
        googlePage.enterSearchQuery("selenium webdriver");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        googlePage.submitSearch();

        // Verify the third result
        String thirdResult = googlePage.getThirdResultText();
        Assert.assertTrue(thirdResult.contains("What is Selenium WebDriver?"), "The result does not contain the expected text.");

        ScreenShotUtility ScreenshotPage = new ScreenShotUtility(driver);
        Allure.addAttachment("Test Google search", ScreenshotPage.getScreenShotPath());
    }

}
