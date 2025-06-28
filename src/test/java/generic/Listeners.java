package generic;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listeners extends BasePage implements ITestListener 
{
	ExtentSparkReporter ExtentSparkReporter;
	ExtentReports extentreport1;
	public void onStart(ITestContext context)
	{
	    ExtentSparkReporter = new ExtentSparkReporter("./Reports/report.html");
		ExtentSparkReporter.config().setDocumentTitle("E2E testing");
		ExtentSparkReporter.config().setReportName("qsp");
		ExtentSparkReporter.config().setTheme(Theme.DARK);
		
		 extentreport1= new ExtentReports();
		 extentreport1.attachReporter(ExtentSparkReporter);
		 extentreport1.setSystemInfo("OS", "win11");
		 extentreport1.setSystemInfo("browser", "chrome");

		System.out.println("test execution started");
	}
	public void onTestStart(ITestResult result)
	{
		ExtentTest test = extentreport1.createTest(result.getName()+"test case execution started");
			
	}
	public void onTestSuccess(ITestResult result)
	{
		ExtentTest test = extentreport1.createTest(result.getName());
		test.log(Status.PASS,"test case execution Success");
	}
	public   void onTestFailure(ITestResult result)
	{
		ExtentTest test = extentreport1.createTest(result.getName());
		test.log(Status.FAIL,"test case execution failed");
		try {
			getScreenshot.captureScreenshot(driver,result.getName()+Get_date.currentDate()+".png");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void onTestSkipped(ITestResult result)
	{
		ExtentTest test = extentreport1.createTest(result.getName());
		test.log(Status.SKIP,"test case execution skipped");
		
	}
	public void onFinish(ITestContext context)
	{
		extentreport1.flush();
	}
	
	
}
