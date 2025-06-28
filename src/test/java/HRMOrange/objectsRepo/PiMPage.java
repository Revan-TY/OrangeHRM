package HRMOrange.objectsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Initialization_clas;

public class PiMPage extends Initialization_clas {
 
	@FindBy(xpath="//a[.='Add Employee']")
	private WebElement AddEmpBtn;
	
	public PiMPage(WebDriver driver)
	{
		super(driver);
	}
	
	public WebElement clickAddEmp()
	{
		return AddEmpBtn;
	}
	
	
	
}
