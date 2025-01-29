package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPage extends PageBase {

    //Initalize Elements
    private By exampleTwoLink = By.partialLinkText("Example 2");
    private By startButton = By.cssSelector("#start button");
    private By resultText = By.id("finish");

    public DynamicLoadingPage(WebDriver driver) {
        super(driver);
    }

    public void clickExampleTwo() {
        driver.findElement(exampleTwoLink).click();
    } // Click on Example 2

    public void clickStartButton() {
        driver.findElement(startButton).click(); // click Start Button
    }

    public String getResultText() {
        return driver.findElement(resultText).getText(); // Get result Text
    }

   public void WaitUntilTextAppears(){
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.textToBe(resultText,"Hello World!")); // Give Explicit wait until the Text appears
   }
}
