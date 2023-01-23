package stepDefination;

import com.ctc.wstx.shaded.msv_core.verifier.jarv.Const;
import com.qaprosoft.carina.core.foundation.cucumber.CucumberRunner;

import constants.Constants;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import page.ProductPage;

public class ProductStep extends CucumberRunner{


	public static ProductPage productPage=null;
	public static WebDriver driver = Constants.getDriver();
	
	
	@Then("Verify the products page")
	public void verify_the_products_page() throws InterruptedException {
		productPage= new ProductPage(Constants.driver);
		Assert.assertEquals(productPage.getPageHeader(),"PRODUCTS");
		productPage.click_on_product();
		Thread.sleep(2000);
	}
	
	   
}
