package excelFileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class CopyExcelData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path = (System.getProperty("user.dir")+"\\src\\excelFileHandling\\TestData1.xls");
		
		FileInputStream file = new FileInputStream(path);
		HSSFWorkbook wb = new HSSFWorkbook(file);
		
		HSSFSheet sheet =wb.getSheet("Sheet2");
		
		HSSFRow row= sheet.getRow(0);
		
		HSSFCell cell = row.getCell(0);
		String val = cell.getStringCellValue();
		
		
		int rows = sheet.getLastRowNum();
		int cols = row.getLastCellNum();
			
			
		String[][] data= new String[rows+1][cols]; 
		
		
		for (int i=0; i<=rows;i++)
		{
			for (int j=0; j<cols;j++)
			{
				String Val2= sheet.getRow(i).getCell(j).getStringCellValue();
				
				
				//Copy Data in Array
				data[i][j]= Val2;
			}
			
			
		}
		
		//Copy Data in Another Worksheet
		HSSFSheet sheet2= wb.createSheet("sheet3");
		
		for (int r=0; r<data.length;r++)
		{
			HSSFRow row1 = sheet2.getRow(r);
			
			if(row1==null)
				row1=sheet2.createRow(r);
			
			for (int c=0; c<data[0].length;c++)
			{
				HSSFCell cell1=row1.getCell(c);
				if(cell1==null)
				cell1= row1.createCell(c);
				
				cell1.setCellValue(data[r][c]);
			}
		}
		
		FileOutputStream fileout = new FileOutputStream(path);
		wb.write(fileout);
		fileout.close();
		

	}

}
