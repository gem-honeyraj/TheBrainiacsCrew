package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class ProductPage extends AbstractPage{

	public ProductPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id= "item_2_title_link")
	private ExtendedWebElement productName;
	public ExtendedWebElement getProductName() {
		return productName;
	}
	
	public void click_on_product()
	{
		getProductName().click();
	}
	public String getPageHeader()
    {
		
        return getDriver().findElement(By.className("title")).getText();
    }

}
