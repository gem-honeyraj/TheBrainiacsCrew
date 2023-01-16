package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class CheckoutPage extends AbstractPage {

	public CheckoutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="first-name")
	private ExtendedWebElement fname;
	
	@FindBy(id="last-name")
	private ExtendedWebElement lname;
	
	@FindBy(id="postal-code")
	private ExtendedWebElement pcode;
	
	@FindBy(id="continue")
	private ExtendedWebElement continueBtn;
	
	@FindBy(id="finish")
	private ExtendedWebElement finishBtn;
	
	@FindBy(xpath="//span[@class='title']")
	private ExtendedWebElement titleValue;
	
	public ExtendedWebElement getTitleValue() {
		return titleValue;
	}

	public ExtendedWebElement getFname() {
		return fname;
	}

	public ExtendedWebElement getLname() {
		return lname;
	}

	public ExtendedWebElement getPcode() {
		return pcode;
	}

	public ExtendedWebElement getContinueBtn() {
		return continueBtn;
	}

	public ExtendedWebElement getFinishBtn() {
		return finishBtn;
	}

	public void fillFirstName(String fname)
    {
		getFname().type(fname);
    }
    public void fillLastName(String lname)
    {
        getLname().type(lname);
    }
    public void fillZip(String code)
    {
        getPcode().type(code);
    }
    public void click_on_continue()
    {
    	getContinueBtn().click();
    }
    public void click_on_finishBtn()
    {
    	getFinishBtn().click();
    }
	
	
}
