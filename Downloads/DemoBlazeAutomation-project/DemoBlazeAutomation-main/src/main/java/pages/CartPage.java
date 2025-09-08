
package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;
    public CartPage(WebDriver driver) {
    	this.driver = driver; 
    	}
    public String getCartText() {
    	return driver.findElement(By.id("tbodyid")).getText(); 
    	}
}
