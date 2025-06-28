package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Initialization_clas{

	public Initialization_clas(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
