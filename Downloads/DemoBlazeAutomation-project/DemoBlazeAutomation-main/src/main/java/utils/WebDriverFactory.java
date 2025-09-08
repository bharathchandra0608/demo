
package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public static WebDriver getDriver(String browser) {
    	WebDriver driver;
        switch (browser.toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Himanshu Grover\\Desktop\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");  
                driver = new ChromeDriver();
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver", "C:\\Users\\Himanshu Grover\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe");
                driver = new EdgeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\Himanshu Grover\\Desktop\\Selenium\\geckodriver-v0.36.0-win-aarch64\\geckodriver.exe");  
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Browser not supported: " + browser);
        }
        driver.manage().window().maximize();
        return driver;
    }
}
