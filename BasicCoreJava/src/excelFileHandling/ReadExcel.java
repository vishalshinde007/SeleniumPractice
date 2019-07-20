package excelFileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//FileInputStream file = new FileInputStream("D:\\CodeBase\\SeleniumAutoamtion\\BasicCoreJava\\src\\excelFileHandling\\TestData.xls");
		//System.out.println(System.getProperty("user.dir"));
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\excelFileHandling\\TestData.xls");
		HSSFWorkbook wb = new HSSFWorkbook(file);
		
		HSSFSheet sheet =wb.getSheet("Sheet1");
		
		HSSFRow row= sheet.getRow(0);
		
		
		
		HSSFCell cell = row.getCell(0);
		String val = cell.getStringCellValue();
		
		
		int rows = sheet.getLastRowNum();
		int cols = row.getLastCellNum();
		//System.out.println(rows);
		//System.out.println(cols);
		
		String Val1= sheet.getRow(0).getCell(0).getStringCellValue();
		
		
		
		for (int i=0; i<=rows;i++)
		{
			for (int j=0; j<cols;j++)
			{
				String Val2= sheet.getRow(i).getCell(j).getStringCellValue();
				
				
				System.out.print(Val2 + " ");
			}
			
			System.out.println();
		}
		
		
		
		
		
		
	}

}
