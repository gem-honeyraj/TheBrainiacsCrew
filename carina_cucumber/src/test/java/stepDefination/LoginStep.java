package stepDefination;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qaprosoft.carina.core.foundation.cucumber.CucumberRunner;

import constants.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import page.HomePage;
import page.LoginPage;

public class LoginStep extends CucumberRunner{

	//public static HomePage homePage = null;
	public static LoginPage loginPage=null;
	public static WebDriver driver = null;
	
	
	@Given("Launch the url")
	public void launch_the_url() {
//		WebDriverManager.chromedriver().setup();
//	      Constants.driver=new ChromeDriver();
		Constants.setDriver();
		driver = Constants.getDriver();
	      driver.get("https://www.saucedemo.com/");
	      loginPage = new LoginPage(driver);
	        System.out.println(loginPage.isPageOpened());
	        System.out.println("Hello");
	}
	
	@Then("Login using {string} and {string}")
	public void login_using_and(String string, String string2) {
	
        loginPage.doLogin("standard_user", "secret_sauce");
	}
}
