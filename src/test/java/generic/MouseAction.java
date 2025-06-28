package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MouseAction {

	public static void rightClick(WebDriver driver, WebElement element )
	{
		Objects.ActionS_class(driver).contextClick(element).perform();;
	}
	public static void mouseHover(WebDriver driver, WebElement element )
	{
		Objects.ActionS_class(driver).moveToElement(element).perform();;
	}
	public static void doubleClick(WebDriver driver, WebElement element )
	{
		Objects.ActionS_class(driver).doubleClick(element).perform();;
	}
	public static void clickAndHold(WebDriver driver, WebElement element )
	{
		Objects.ActionS_class(driver).clickAndHold(element).perform();;
	}
	
}
