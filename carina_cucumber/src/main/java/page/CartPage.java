package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class CartPage extends AbstractPage {

	public CartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="checkout")
	private ExtendedWebElement checkoutButton;
	
	public ExtendedWebElement getCheckoutButton() {
		return checkoutButton;
	}
	
	public void click_on_Checkout()
	{
		getCheckoutButton().click();
	}
	
}
