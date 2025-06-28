package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class getScreenshot implements Application_constants {
 
	public static void captureScreenshot(WebDriver driver ,String SS_path) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm= new File(screensPath+SS_path);
		FileHandler.copy(temp, perm);
	}
	
	
}
