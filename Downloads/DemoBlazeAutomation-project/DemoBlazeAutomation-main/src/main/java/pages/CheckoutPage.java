package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;
    public CheckoutPage(WebDriver driver) {
    	this.driver = driver; 
    	}
    public void clickPlaceOrderButton() {
    	driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click(); 
    	}
    public void fillCheckoutForm(String name, String country, String city, String card, String month, String year) {
        driver.findElement(By.id("name")).sendKeys(name);
        driver.findElement(By.id("country")).sendKeys(country);
        driver.findElement(By.id("city")).sendKeys(city);
        driver.findElement(By.id("card")).sendKeys(card);
        driver.findElement(By.id("month")).sendKeys(month);
        driver.findElement(By.id("year")).sendKeys(year);
    }
    public void clickPurchase() throws InterruptedException {
    	//Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click(); 
    	}
    public String getConfirmationMessage() {
        return driver.findElement(By.cssSelector(".sweet-alert > h2")).getText();
    }
}
