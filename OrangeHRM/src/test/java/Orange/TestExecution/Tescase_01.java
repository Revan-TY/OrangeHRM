package Orange.TestExecution;

import org.testng.annotations.Test;

import Orange.generic.BasePage;



public String[][] readdata()
{
	int Lastrow= ReadExcel.accessLastrow();
	int Lcelnum= ReadExcel.accessLastcel();
	String[][] value= new String[LastRow+1][Lcelnum];
	for(int r=0;r<=Lastrow;r++)
	{
		for(int c=0;c<3;c++) 
		{
			value[r][c]=ReadExcel.accessCellValue("./")
		}
	}
	return value;
}

@Test
public class Tescase_01 extends BasePage {
	@Test
	public void testcase01() {
		db.ClickPimBtn().click();
		pm.clickAddEmp().click();
		aemp.enterFN().sendKeys("Admin");
		aemp.enterLN().sendKeys("add");
		aemp.clickSave().click();
	}
}

