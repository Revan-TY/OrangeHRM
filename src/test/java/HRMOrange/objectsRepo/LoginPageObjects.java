package HRMOrange.objectsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Initialization_clas;

public class LoginPageObjects extends Initialization_clas{

	@FindBy(name="username")
	private WebElement UN_TF;
	@FindBy(name="password")
	private WebElement Psw_TF;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Login_Btn;
	
	public LoginPageObjects(WebDriver driver)
	{
		super(driver);
	}
	
	public WebElement enterUsn()
	{
	     return	UN_TF;
	}
	public WebElement enterPsw()
	{
	     return	Psw_TF;
	}
	public WebElement clickLogin()
	{
	     return	Login_Btn;
	}
	
	
}
