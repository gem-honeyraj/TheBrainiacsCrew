package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class LoginPage extends AbstractPage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id = "user-name")
    private ExtendedWebElement uname;
	
	@FindBy(id = "password")
    private ExtendedWebElement password;
	
	@FindBy(id = "login-button")
    private ExtendedWebElement loginbtn;

	public ExtendedWebElement getUname() {
		return uname;
	}

	public ExtendedWebElement getPassword() {
		return password;
	}

	public ExtendedWebElement getLoginbtn() {
		return loginbtn;
	}
	
	public void doLogin(String name, String password) {
		 getUname().type(name);
		 getPassword().type(password);
		 getLoginbtn().click();
	}
	

}
