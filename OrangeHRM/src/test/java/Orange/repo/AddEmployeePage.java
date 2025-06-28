package Orange.repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage {
	@FindBy(name="firstName")
	private WebElement FN_TF;
	@FindBy(name="middleName")
	private WebElement MN_TF;
	@FindBy(name="lastName")
	private WebElement LN_TF;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Save_btn;
	
	
	
	public AddEmployeePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
public WebElement enterFN() 
{
	return FN_TF;
}
public WebElement enterMN()
{
	return MN_TF;
}
public WebElement enterLN()
{
	return LN_TF;
}
public WebElement clickSave()
{
	return Save_btn;
}
}