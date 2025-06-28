package generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import HRMOrange.objectsRepo.AddEmpPage;
import HRMOrange.objectsRepo.Dashboard;
import HRMOrange.objectsRepo.LoginPageObjects;
import HRMOrange.objectsRepo.PiMPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage  implements Application_constants 
{
	public static WebDriver driver;
	public Dashboard db;
	public LoginPageObjects lpo;
	public  ReadPropertyFile rp;
	public PiMPage pm;
	public AddEmpPage  aemp;
	@Parameters("browsers")
	@BeforeClass
	public void LaunchBrowser(String browsers) throws IOException
	{
		if(browsers.equals("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(browsers.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    lpo= new LoginPageObjects(driver);
		db = new Dashboard(driver);
		pm= new PiMPage(driver);
		aemp=new AddEmpPage(driver);
		rp= new ReadPropertyFile();
		driver.get(rp.url());
	}
	@BeforeMethod
	public void accessApplication() throws IOException
	{
	lpo.enterUsn().sendKeys(rp.usn());
	lpo.enterPsw().sendKeys(rp.psw());
	lpo.clickLogin().click();
	}
	
	@AfterMethod
	public void logoutApplication()
	{
		db.logoutMenuOpt().click();
		db.clickLogout().click();
		
	}
	@AfterClass
	public void CloseBrowser()
	{
		driver.quit();
	}
	
	
	
}
