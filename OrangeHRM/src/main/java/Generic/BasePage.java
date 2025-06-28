package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectreference.Dashboard;
import objectreference.Loginpage;
public class BasePage 
{
	WebDriver driver;
	Dashboard db;
	Loginpage lo;
	@BeforeMethod
	public void LaunchBrowser()
	{
	WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
lo = new Loginpage(driver);
db = new Dashboard(driver);
	}
	public void tc()
	{
		System.out.println("hello");
	}
	@AfterMethod
	public void closeBrowser() 
	{
db.logoutMenuOpt().click();
db.clickLogout().click();
driver.quit();
}
}

