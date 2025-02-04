package Utilities;

import base.PageBase;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Utility for Attaching Screenshot functionality.
 */
public class ScreenShotUtility extends PageBase {
    public ScreenShotUtility(WebDriver driver) {
        super(driver);
    }

    public static FileInputStream getScreenShotPath() throws IOException {

        TakesScreenshot SrcShot = (TakesScreenshot)driver;
        File SrcFile = SrcShot.getScreenshotAs(OutputType.FILE);
        return new FileInputStream(SrcFile);
    }

}