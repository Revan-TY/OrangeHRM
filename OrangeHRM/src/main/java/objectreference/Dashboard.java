package objectreference;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard
{
@FindBy(xpath="//img[@alt='profile picture'])[1]")
private WebElement logoutMenu;
@FindBy(xpath="//a[.='Logout']")
private WebElement logOutOtp;
public Dashboard(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public WebElement logoutMenuOpt()
{
	return logOutOtp;
	
}
public WebElement clickLogout()
{
	return logOutOtp;
	
}
}
