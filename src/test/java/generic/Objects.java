package generic;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Objects {

	public static  Actions ActionS_class(WebDriver driver)
	{
			Actions a = new Actions(driver);
			return  a;
	}
	
	public static Select dropdown(WebElement element)
	{
		Select s = new  Select(element);
		return  s;
	}
	
	public static void robot_class() throws AWTException
	{
		Robot a = new  Robot();
	}
	
	
	
	
}
