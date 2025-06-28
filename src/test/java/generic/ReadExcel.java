package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	static FileInputStream fis;
	static XSSFWorkbook book;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;
	public static String accessCellvalue(String path,String SheetName,int Row,int Cell) throws IOException
	{
		 fis = new FileInputStream(path);
		 book = new XSSFWorkbook(fis);
		 sheet = book.getSheet(SheetName);
		 row = sheet.getRow(Row);
		 cell = row.getCell(Cell);
		String value = cell.getStringCellValue();
	    return value;
		
	}
	   public static int accessLastrow(String path,String SheetName) throws IOException
	  {
		   fis = new FileInputStream(path);
			 book = new XSSFWorkbook(fis);
			 sheet = book.getSheet(SheetName);
			int Lrownum = sheet.getLastRowNum();
			return Lrownum;
	  }
	 
	   public static  int accessLastcel(String path,String SheetName,int Row) throws IOException
	   { 
		   fis = new FileInputStream(path);
		 book = new XSSFWorkbook(fis);
		 sheet = book.getSheet(SheetName);
		 row = sheet.getRow(Row);
		 int LcelNum = row.getLastCellNum();
		 return LcelNum;
	   }
	
	
	
	
}
