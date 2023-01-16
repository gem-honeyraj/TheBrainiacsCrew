package stepDefination;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.foundation.cucumber.CucumberRunner;

import constants.Constants;
import io.cucumber.java.en.Then;
import page.CartPage;
import page.CheckoutPage;
import page.LoginPage;

public class CheckoutStep extends CucumberRunner{

	public static CheckoutPage checkoutpage=null;
	public static WebDriver driver = null;
	
	@Then("fill the form with {string} {string} and {string} and continue")
	public void fill_the_form_with_and_and_continue(String string, String string2, String string3) {
		checkoutpage= new CheckoutPage(Constants.driver);
		checkoutpage.fillFirstName("Test");
		checkoutpage.fillLastName("Name");
		checkoutpage.fillZip("267364");
		checkoutpage.click_on_continue();
	}
	@Then("verify the checkout page and place the order")
	public void verify_the_checkout_page_and_place_the_order() {
		checkoutpage= new CheckoutPage(Constants.driver);
		checkoutpage.click_on_finishBtn();
	}
	@Then("verify the successful message")
	public void verify_the_successful_message() {
		checkoutpage= new CheckoutPage(Constants.driver);
		String val=checkoutpage.getTitleValue().getText();
        if(val.equalsIgnoreCase("CHECKOUT: COMPLETE!"))
            System.out.println("Verified the Successfull page title");
	}
}
