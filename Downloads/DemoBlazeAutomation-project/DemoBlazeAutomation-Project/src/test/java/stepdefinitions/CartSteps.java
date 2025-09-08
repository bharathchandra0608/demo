
package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.CartPage;

import java.util.List;
import java.time.Duration;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CartSteps {
    CartPage cartPage;

    @When("I add a phone product to the cart")
    public void i_add_a_phone_product_to_the_cart() throws InterruptedException {
        NavigationSteps.driver.findElement(By.linkText("Phones")).click();
        Thread.sleep(1000);
        NavigationSteps.waitUtil.waitForElementVisible(By.linkText("Samsung galaxy s6"));
        WebElement phoneProduct = NavigationSteps.driver.findElement(By.linkText("Samsung galaxy s6"));
        phoneProduct.click();
        NavigationSteps.waitUtil.waitForElementClickable(By.cssSelector("a.btn.btn-success.btn-lg"));
        NavigationSteps.driver.findElement(By.cssSelector("a.btn.btn-success.btn-lg")).click();
        NavigationSteps.waitUtil.waitForAlertPresent();
        Alert alert = NavigationSteps.driver.switchTo().alert();
        alert.accept();
        NavigationSteps.driver.findElement(By.id("nava")).click();
    }

    @When("I add a laptop product to the cart")
    public void i_add_a_laptop_product_to_the_cart() throws InterruptedException {
        NavigationSteps.driver.findElement(By.linkText("Laptops")).click();
        Thread.sleep(1000);
        NavigationSteps.waitUtil.waitForElementVisible(By.linkText("Sony vaio i5"));
        WebElement laptopProduct = NavigationSteps.driver.findElement(By.linkText("Sony vaio i5"));
        laptopProduct.click();
        NavigationSteps.waitUtil.waitForElementClickable(By.cssSelector("a.btn.btn-success.btn-lg"));
        NavigationSteps.driver.findElement(By.cssSelector("a.btn.btn-success.btn-lg")).click();
        NavigationSteps.waitUtil.waitForAlertPresent();
        Alert alert = NavigationSteps.driver.switchTo().alert();
        alert.accept();
        NavigationSteps.driver.findElement(By.id("nava")).click();
    }

    @When("I add a monitor product to the cart")
    public void i_add_a_monitor_product_to_the_cart() throws InterruptedException {
        NavigationSteps.driver.findElement(By.linkText("Monitors")).click();
        Thread.sleep(1000);
        NavigationSteps.waitUtil.waitForElementVisible(By.linkText("Apple monitor 24"));
        WebElement monitorProduct = NavigationSteps.driver.findElement(By.linkText("Apple monitor 24"));
        monitorProduct.click();
        NavigationSteps.waitUtil.waitForElementClickable(By.cssSelector("a.btn.btn-success.btn-lg"));
        NavigationSteps.driver.findElement(By.cssSelector("a.btn.btn-success.btn-lg")).click();
        NavigationSteps.waitUtil.waitForAlertPresent();
        Alert alert = NavigationSteps.driver.switchTo().alert();
        alert.accept();
        NavigationSteps.driver.findElement(By.id("nava")).click();
    }

    @Then("All selected products should be in the cart")
    public void all_selected_products_should_be_in_the_cart() throws InterruptedException {
        NavigationSteps.driver.findElement(By.id("cartur")).click();
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(NavigationSteps.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector("#tbodyid > tr"), 0));

        List<WebElement> cartRows = NavigationSteps.driver.findElements(By.cssSelector("#tbodyid > tr"));
        System.out.println("Number of products in cart: " + cartRows.size());

        List<String> productNames = new ArrayList<>();
        for (WebElement row : cartRows) {
            String title = row.findElement(By.xpath("td[2]")).getText();
            productNames.add(title);
        }
        System.out.println("Cart contains products: " + productNames);

        assertTrue(productNames.contains("Samsung galaxy s6"));
        assertTrue(productNames.contains("Sony vaio i5"));
        assertTrue(productNames.contains("Apple monitor 24"));
    }

}
