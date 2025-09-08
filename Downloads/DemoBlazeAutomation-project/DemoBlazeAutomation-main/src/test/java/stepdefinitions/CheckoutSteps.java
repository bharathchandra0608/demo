
package stepdefinitions;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import pages.CheckoutPage;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckoutSteps {
    
    CheckoutPage checkoutPage;
    

    @When("I proceed to Place Order")
    public void i_proceed_to_place_order() {
        checkoutPage = new CheckoutPage(NavigationSteps.driver);
        checkoutPage.clickPlaceOrderButton();
        NavigationSteps.waitUtil.waitForElementVisible(By.id("orderModal"));
    }

    @When("I provide details {string} {string} {string} {string} {string} {string}")
    public void i_provide_details(String name, String country, String city, String card, String month, String year) throws InterruptedException {
        checkoutPage.fillCheckoutForm(name, country, city, card, month, year);
        Thread.sleep(2000);
    }

    @When("I complete purchase")
    public void i_complete_purchase() throws InterruptedException {
        checkoutPage.clickPurchase();
        Thread.sleep(1000);
    }

    @Then("I should see success message {string}")
    public void i_should_see_success_message(String expectedMessage) {
        String actualMessage = checkoutPage.getConfirmationMessage();
        assertEquals(expectedMessage, actualMessage);
    }
}
