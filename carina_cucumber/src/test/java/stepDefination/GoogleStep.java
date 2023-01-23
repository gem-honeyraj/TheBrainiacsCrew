package stepDefination;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.foundation.cucumber.CucumberRunner;

import constants.Constants;
import io.cucumber.java.en.Given;

public class GoogleStep extends CucumberRunner{
	public static WebDriver driver = Constants.getDriver();
	

	@Given("Open the google.com")
	public void open_the_google_com() {
		Constants.setDriver();
		driver = Constants.getDriver();
	    driver.get("https://www.google.com/");
	}


}
