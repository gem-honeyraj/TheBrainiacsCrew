package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class ProductDetailPage extends AbstractPage{

	public ProductDetailPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//div[@class='inventory_details_name large_size']")
    private ExtendedWebElement productName;
	
	@FindBy(id = "add-to-cart-sauce-labs-onesie")
    private ExtendedWebElement addtoCartLink;
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
    private ExtendedWebElement shoppingLink;
	
	 public ExtendedWebElement getProductName() {
		return productName;
	}
	 
	 public ExtendedWebElement getAddtoCartLink() {
			return addtoCartLink;
	}
	public ExtendedWebElement getShoppingLink() {
			return shoppingLink;
	}
	
	public String verifyProduct()
	    {
	        String val=getProductName().getText();
	        return val;
	    }
	
	public void click_on_addToCart()
	{
		getAddtoCartLink().click();
		getShoppingLink().click();
	}
	
	
	
}
