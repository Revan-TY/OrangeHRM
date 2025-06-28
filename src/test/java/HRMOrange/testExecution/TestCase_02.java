package HRMOrange.testExecution;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BasePage;


public class TestCase_02 extends BasePage {

	@Test
	public void verify_title() throws InterruptedException
	{
	
		String Expected_Result = "Dashboard";
		String Actual_Result=db.bashboard_Title().getText();
		Assert.assertEquals(Actual_Result, Expected_Result);
		System.out.println("Verification is done");
		
//		WebElement dpName = db.bashboard_Title();
//		MouseAction.rightClick(driver, dpName);
//		Thread.sleep(2000);
//		
	}
	
	
	
	
	
}
