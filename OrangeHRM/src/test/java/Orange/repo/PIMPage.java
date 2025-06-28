package Orange.repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage {
	@FindBy(xpath="//a[.='Add Employee']")
    private WebElement AddEmpBtn;
  
	public PIMPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
public WebElement clickAddEmp()
{
	return AddEmpBtn;
}
}