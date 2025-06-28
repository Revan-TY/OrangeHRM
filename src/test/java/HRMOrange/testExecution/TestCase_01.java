package HRMOrange.testExecution;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.ReadExcel;



public class TestCase_01 extends BasePage
{
	
     @DataProvider(name = "testdata")
	public String[][] readdata() throws IOException
	{
		int Lastrow = ReadExcel.accessLastrow(Excelpath,SheetName);
		int Lcelnum = ReadExcel.accessLastcel(Excelpath,SheetName, 0 );
		String[][] value= new String[Lastrow+1][Lcelnum];
		
		for(int r=0;r<=Lastrow;r++)
		{
			for(int c=0;c<3;c++)
			{
				value[r][c]=ReadExcel.accessCellvalue(Excelpath,SheetName, r, c);
			}
		}
		return value;
	}
	
	
	
	
	
	
	@Test(dataProvider = "testdata")
	public void testC_01(String FN, String MN, String LN) throws InterruptedException
	{
		db.clickPim().click();
		pm.clickAddEmp().click();
		aemp.enterFN().sendKeys(FN);
		aemp.enterMN().sendKeys(MN);
		aemp.enterLN().sendKeys(LN);
		aemp.clickSaveBtn().click();
		
//	}
	
	}}
