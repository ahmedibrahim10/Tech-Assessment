package tests;

import Utilities.ScreenShotUtility;
import base.TestBase;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

import java.io.File;
import java.io.IOException;



public class FileUploadTest extends TestBase {

    @Test (priority = 2)
    public void testFileUpload() throws IOException {
        driver.get("https://the-internet.herokuapp.com/upload"); // Navigate to the URL
        FileUploadPage uploadPage = new FileUploadPage(driver); // Get instance of FileUploadPage
        File file = new File(System.getProperty("user.dir") + "./images/Request.png"); // Set up the directory to get the uploaded file
        String filePath = file.getAbsolutePath();
        uploadPage.uploadFile(filePath);
        String uploadedFileName = uploadPage.getUploadedFileName();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(uploadedFileName, "Request.png", "The uploaded file is not matching"); // Check that the file is Uploaded Successfully and Matching
        ScreenShotUtility ScreenshotPage = new ScreenShotUtility(driver);
        Allure.addAttachment("Test File Upload", ScreenshotPage.getScreenShotPath()); // Attach Screenshot to the Allure Report

    }
}
