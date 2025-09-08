
package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class WaitUtil {
    private WebDriverWait wait;

    public WaitUtil(WebDriver driver, int seconds) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
    }

    public void waitForElementVisible(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForElementClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitForAlertPresent() {
        wait.until(ExpectedConditions.alertIsPresent());
    }
}
