package excelFileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class SetValueInExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path = System.getProperty("user.dir")+"\\src\\excelFileHandling\\TestData.xls";
		
		FileInputStream file = new FileInputStream(path);
		HSSFWorkbook wb = new HSSFWorkbook(file);
		
		HSSFSheet sheet =wb.getSheet("Sheet1");
		
		HSSFRow row= sheet.getRow(1);
		
		HSSFCell cell = row.getCell(0);
		
		
			cell.setCellValue("Santoshi");
		
		
		FileOutputStream fileout = new FileOutputStream(path);
		wb.write(fileout);
		fileout.close();
		

	}

}
