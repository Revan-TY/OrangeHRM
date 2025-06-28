package Orange.repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(name="username")
private WebElement UN_TF;
@FindBy(name="password")
private WebElement Psw_TF;
@FindBy(xpath="//button[@type='submit']")
private WebElement Login_Btn;

public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement enterUsn()
{
	return UN_TF;
}
public WebElement enterPsw()
{
	return Psw_TF;
}
public WebElement ClickLogin() 
{
	return Login_Btn;
}
}