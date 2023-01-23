package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.cucumber.CucumberRunner;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

import constants.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GuideStep extends CucumberRunner{

	public static WebDriver driver = Constants.getDriver();
	
	@FindBy(xpath="(//a[@class='tn-atom'])[1]")
	private ExtendedWebElement installationGuide;
	
	public ExtendedWebElement getInstallationGuide() {
		return installationGuide;
	}
	
	@Given("Open the url")
	public void open_the_url() {
		Constants.setDriver();
		driver = Constants.getDriver();
	    driver.get("https://www.carina-core.io/");
	}
	@Then("Click on Installation Guide")
	public void click_on_installation_guide() {
		getInstallationGuide().click();
	}

}
