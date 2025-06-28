package Orange.repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboardpage {
	@FindBy(xpath="(//img[@alt='profile picture'])[1]")
     private WebElement logoutMenu;
	@FindBy(xpath="//a[.='logout']")
	private WebElement logoutOpt;
	@FindBy(xpath="//span[.='PIM']")
	private WebElement PimBtn;
	
	public Dashboardpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
public WebElement logoutMenuOpt() 
{
	return logoutMenu;
}
public WebElement Logoutoptele()
{
	return logoutOpt;
}
public WebElement ClickPimBtn()
{
	return PimBtn;
}
}