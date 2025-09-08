
package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;
import utils.WaitUtil;
import org.openqa.selenium.By;

public class NavigationSteps {
    // Using public static so other stepdefs can reuse the driver and waitUtil if needed
    public static WebDriver driver;
    public static WaitUtil waitUtil;

    @Given("I am on the Demoblaze home page")
    public void i_am_on_the_demoblaze_home_page() {
        
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.demoblaze.com/index.html");
        waitUtil = new WaitUtil(driver, 10);
        waitUtil.waitForElementVisible(By.id("nava"));
    }
}
