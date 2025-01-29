package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage extends PageBase {

    // Initialize Elements on the Page
    private By fileInput = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFileText = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    // Method for Upload a file
    public void uploadFile(String filePath) {
        driver.findElement(fileInput).sendKeys(filePath); // Pass a file Path
        driver.findElement(uploadButton).click(); // Click on Upload Button
    }

    // Method for retrieving Upload file Text Name
    public String getUploadedFileName() {
        return driver.findElement(uploadedFileText).getText();
    }
}
