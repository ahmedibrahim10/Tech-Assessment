package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Page object for Google's search functionality.
 */

public class GoogleSearchPage extends PageBase {

    private By searchBox = By.name("q");
    private By thirdSearchResult = By.className("wM6W7d");


    /**
     * Constructor for GoogleSearchPage.
     *
     * @param driver WebDriver instance passed to the page object.
     */
    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Enter search query into Google's search box.
     *
     * @param query Search term.
     */

    public void enterSearchQuery(String query) {
        driver.findElement(searchBox).sendKeys(query);
    }


    /**
     * Submit the search.
     */
    public void submitSearch() {
        driver.findElement(searchBox).submit();
    }

    /**
     * Retrieve the text of the third search result.
     *
     * @return Text of the third search result.
     */

    public String getThirdResultText() {
        return driver.findElement(thirdSearchResult).getText();
    }
}
