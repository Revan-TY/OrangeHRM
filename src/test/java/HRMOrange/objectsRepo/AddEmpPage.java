package HRMOrange.objectsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Initialization_clas;

public class AddEmpPage extends Initialization_clas
{
	@FindBy(name="firstName")
	private WebElement FN_TF;
	@FindBy(name="middleName")
	private WebElement MN_TF;
	@FindBy(name="lastName")
	private WebElement LN_TF;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement save_Btn;
	
	public AddEmpPage(WebDriver driver)
	{
		super(driver);
	}
	public WebElement enterFN()
	{
		return FN_TF;
	}
	public WebElement enterMN()
	{		
		return MN_TF;
	}public WebElement enterLN()
	{
		return LN_TF;
	}public WebElement clickSaveBtn()
	{
		return save_Btn;
	}
}
