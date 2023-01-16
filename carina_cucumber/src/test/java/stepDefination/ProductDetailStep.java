package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.foundation.cucumber.CucumberRunner;

import constants.Constants;
import io.cucumber.java.en.When;
import page.ProductDetailPage;
import page.ProductPage;

public class ProductDetailStep extends CucumberRunner{

	public static ProductDetailPage productdetailpage=null;
	public static WebDriver driver = Constants.getDriver();
	
	@When("add a {string} into cart")
	public void add_a_into_cart(String string) {
		productdetailpage= new ProductDetailPage(Constants.driver);
		String val=productdetailpage.verifyProduct();
		Assert.assertEquals("Sauce Labs Onesie",val);
		productdetailpage.click_on_addToCart();
		
	}
	
}
