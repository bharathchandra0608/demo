package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
    WebDriver driver;
    public SignUpPage(WebDriver driver) {
    	this.driver = driver; 
    	}
    private By usernameInput = By.id("sign-username");
    private By passwordInput = By.id("sign-password");
    private By signUpButton = By.xpath("//button[text()='Sign up']");
    public void enterUsername(String username) {
    	driver.findElement(usernameInput).sendKeys(username); 
    	}
    public void enterPassword(String password) {
    	driver.findElement(passwordInput).sendKeys(password); 
    	}
    public void clickSignUp() {
    	driver.findElement(signUpButton).click(); 
    	}
}