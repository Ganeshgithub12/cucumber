package demos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLDemo 
{

	public static void main(String[] args) throws IOException 
	{
	  XLUtils.setData("c:\\demo\\testdata.xlsx", "Employeedata", 1, 4, "fail");
	  XLUtils.fillRedcolor("c:\\demo\\testdata.xlsx", "Employeedata", 1, 4);
	 
	 
	 
		
		

	}

}
