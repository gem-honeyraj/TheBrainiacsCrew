package page;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class HomePage extends AbstractPage{

	public HomePage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL(R.CONFIG.get(Configuration.Parameter.URL.getKey()));
		// TODO Auto-generated constructor stub
	}

}
