package Orange.generic;

import java.io.FileInputStream;

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
	
public static String accessCellValue(String path,String SheetNme,int Row,int )
{
	 fis= new FileInputStream ();
	 book= new XSSFWorkbook(fis);
	 sheet =book.getSheet(SheetName);
	 row =sheet.getRow(Row);
	 cell =row.getCell(Cell);
	String Value= cell.getStringCellValue();
	return value;
}
public static int accessLastrow(String path, String SheetName)
{
	FileInputStream fis = new FileInputStream (path);
	XSSFWorkbook book = new XSSFWorkbook(fis);
	XSSFSheet sheet = book.getSheet(SheetName);
	int Lrownum= sheet.getLastRowNum();
	return Lrownum;
	
}



public static int accessLastCel(String path, String SheetName,int Row,)
{
	 fis = new FileInputStream (path);
	 book = new XSSFWorkbook(fis);
	 sheet = book.getSheet(SheetName);
	row = sheet.getRow(Row);
	int LcelNum=row.getLastCellNum();
	return LcelNum;
}