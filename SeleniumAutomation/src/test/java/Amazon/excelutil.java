package Amazon;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutil {
 public static FileInputStream fileloc;
 public static XSSFWorkbook wBook;
 public static XSSFSheet wSheet;
 public static XSSFRow row;
 public static XSSFCell cell;
//get rowcount;
public static  int getRowCount(String xFile,String xSheet) throws IOException {
	fileloc=new FileInputStream(xFile);
	wBook=new XSSFWorkbook(fileloc);
	wSheet=wBook.getSheet(xSheet);
int rowCount=wSheet.getLastRowNum();
wBook.close();
fileloc.close();
return rowCount;
}
////get the cell count of each row
public static int getCellCount(String xFile,String xSheet,int rowNum) throws IOException {
	fileloc=new FileInputStream(xFile);
	wBook=new XSSFWorkbook(fileloc);
	wSheet=wBook.getSheet(xSheet);
   row=wSheet.getRow(rowNum);
   int cellCount=row.getLastCellNum();
wBook.close();
fileloc.close();
return cellCount;
}
//get the value in each cell
	public static  String getCellData(String xFile,String xSheet,int rowNum,int colnum) throws IOException
	{
		fileloc=new FileInputStream(xFile);
		wBook=new XSSFWorkbook(fileloc);
		wSheet=wBook.getSheet(xSheet);
		row=wSheet.getRow(rowNum);
		cell=row.getCell(colnum);
		DataFormatter formatter=new DataFormatter();
		String cellData=formatter.formatCellValue(cell);
		wBook.close();
		fileloc.close();
		return cellData;
}
}

