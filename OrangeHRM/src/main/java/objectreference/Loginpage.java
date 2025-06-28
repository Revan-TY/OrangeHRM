package objectreference;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage
{
@FindBy(name="username")
private WebElement UN_TF;
@FindBy(name="password")
private WebElement psw_TF;
@FindBy(xpath="//button[@type='submit']")
private WebElement Login_Btn;
public Loginpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement enterUsn()
{
	return UN_TF;
	
}
public WebElement enterPsw()
{
	return psw_TF;
}

public WebElement clickLogin()
{
	return Login_Btn;
}
}