package stepDefination;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.foundation.cucumber.CucumberRunner;

import constants.Constants;
import io.cucumber.java.en.When;
import page.CartPage;
import page.ProductPage;

public class CartStep extends CucumberRunner {

	public static CartPage cartpage=null;
	public static WebDriver driver = Constants.getDriver();
	

	@When("goto the cart page and verify product details and checkout")
	public void goto_the_cart_page_and_verify_product_details_and_checkout() {
		cartpage= new CartPage(Constants.driver);
		cartpage.click_on_Checkout();
	}


}
