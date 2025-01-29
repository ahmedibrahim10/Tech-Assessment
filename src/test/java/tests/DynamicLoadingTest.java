package tests;

import Utilities.ScreenShotUtility;
import base.TestBase;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;

import java.io.File;
import java.io.IOException;

/**
 * Test class to validate Google search functionality.
 */
public class DynamicLoadingTest extends TestBase {

    @Test (priority = 3)
    public void testDynamicLoading() throws IOException {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading"); // Navigate to URL
        DynamicLoadingPage dynamicPage = new DynamicLoadingPage(driver);
        dynamicPage.clickExampleTwo(); // Click on Example 2 invoked
        dynamicPage.clickStartButton(); // Click on Start Button
        String resultText = dynamicPage.getResultText(); // Result Text Retrieval
        dynamicPage.WaitUntilTextAppears(); // wait until Text appears on the Page
        Assert.assertEquals(resultText, "Hello World!", "The final text is not as expected."); //Check that the text Displayed is "Hello World!"
        ScreenShotUtility ScreenshotPage = new ScreenShotUtility(driver); // get instance from ScreenShotUtility
       Allure.addAttachment("Test Dynamic loading", ScreenshotPage.getScreenShotPath()); // Attach Screenshot with Allure Report


    }
}
