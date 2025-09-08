
package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
    	this.driver = driver; 
    	}
    private By usernameInput = By.id("loginusername");
    private By passwordInput = By.id("loginpassword");
    private By loginButton = By.xpath("//button[text()='Log in']");
    
    public void enterUsername(String username) { 
    	driver.findElement(usernameInput).sendKeys(username); 
    	}
    public void enterPassword(String password) {
    	driver.findElement(passwordInput).sendKeys(password); 
    	}
    public void clickLogin() {
    	driver.findElement(loginButton).click(); 
    	}
}
