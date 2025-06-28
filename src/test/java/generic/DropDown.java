package generic;

import org.openqa.selenium.WebElement;

public class DropDown {

	
	public void selectOptions(WebElement element,Object value)
	{
		
	if(value instanceof Integer)
	{
		Objects.dropdown(element).selectByIndex((Integer)value);
	}
	else if(value instanceof String)
	{
		try {
			Objects.dropdown(element).selectByValue((String)value);
		} catch
		(Exception e) {
			Objects.dropdown(element).selectByVisibleText((String)value);
		} 		
	}
	}
	public void deselectOptions(WebElement element,Object value)
	{
		
	if(value instanceof Integer)
	{
		Objects.dropdown(element).deselectByIndex((Integer)value);
	}
	else if(value instanceof String)
	{
		try {
			Objects.dropdown(element).deselectByValue((String)value);
		} catch
		(Exception e) {
			Objects.dropdown(element).deselectByVisibleText((String)value);
		} 		
	}	
	}	
}
