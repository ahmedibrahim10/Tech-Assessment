package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

/**
 * TestBase class manages WebDriver setup, teardown, and utilities for tests.
 */
public class TestBase {
    protected WebDriver driver;
    /**
     * Set up WebDriver before each test.
     */
    @BeforeMethod
    public void setup() {
        driver = new FirefoxDriver(); // Initialize FirefoxDriver
        driver.manage().window().maximize(); // Maximize browser window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    /**
     * Quit WebDriver after each test.
     */
    @AfterMethod
    public void teardown() {

        driver.quit();

    }



    }

