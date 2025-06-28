package HRMOrange.objectsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Initialization_clas;

public class Dashboard extends Initialization_clas {
	@FindBy(xpath="(//img[@alt='profile picture'])[1]")
	private WebElement logoutMenu;
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logoutOtp;
	@FindBy(xpath="//span[.='PIM']")
	private WebElement PimBtn;
	@FindBy (xpath="//span[.='Dashboard']")
	private WebElement Dashboard;
	
	public Dashboard(WebDriver driver)
	{
		super(driver);
	} 
	
	public WebElement logoutMenuOpt()
	{
		return logoutMenu;
	}
	public WebElement clickLogout()
	{
		return logoutOtp;}
	public WebElement clickPim()
	{
		return PimBtn;}
	public WebElement bashboard_Title()
	{
		return Dashboard;}
}
