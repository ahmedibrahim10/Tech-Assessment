package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * The PageBase class is the parent for all page objects.
 * It initializes web elements and provides common reusable methods.
 */
public class PageBase {
    protected static WebDriver driver;
    /**
     * Constructor to initialize the WebDriver and PageFactory.
     *
     * @param driver WebDriver instance passed to the page object.
     */
    public PageBase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
