package Orange.generic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Orange.repo.AddEmployeePage;
import Orange.repo.Dashboardpage;
import Orange.repo.LoginPage;
import Orange.repo.PIMPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	WebDriver driver;
	public LoginPage lpo;
	public Dashboardpage db;
	public PIMPage pm;
	public AddEmployeePage aemp;
	public ReadData rp;
@BeforeClass
public void LaunchBrowser()throws IOException {
	WebDriverManager.chromedriver().setup();
	 driver= new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 lpo = new LoginPage(driver );
	 db = new Dashboardpage(driver);
	 pm= new PIMPage(driver);
	 aemp=new AddEmployeePage(driver);
	 driver.get(rp.url());
}
@BeforeMethod
public void accessApplication() throws IOException
{
	lpo.enterUsn().sendKeys(rp.usn());
	lpo.enterPsw().sendKeys(rp.psw());
	lpo.ClickLogin().click();
}
@Test
public void testcase()
{
	System.out.println("Done");
}
@AfterMethod
public void logoutApplication() 
{
	db.logoutMenuOpt().click();;
	db.Logoutoptele().click();
}
@AfterClass
	public void CloseBrowser()
	{
		driver.quit();
	}
}