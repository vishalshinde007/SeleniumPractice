package excelFileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path = System.getProperty("user.dir") + "\\src\\excelFileHandling\\TestData1.xls";
		FileInputStream file = new FileInputStream(path);
		
		HSSFWorkbook wb = new HSSFWorkbook(file);
		HSSFSheet sheet = wb.createSheet("Sheet2");
		
		
		String[][] data= {{"Name","Surname","Address"},
		                             {"Vishal","Shinde","Pune"},
		                             {"Satya","Shinde","Pune"}
		                  };
		
		
		
		for (int i=0; i<data.length; i++)
					{
			
			HSSFRow row =sheet.getRow(i);
			
			if(row==null)	
				
				row= sheet.createRow(i);
			
			for (int j=0; j<data[0].length; j++)
			{
				
				
					
				HSSFCell cell = row.getCell(j);
				if(cell == null)
					cell = row.createCell(j);
				
				cell.setCellValue(data[i][j]);
			}
		}
		
		FileOutputStream fileout = new FileOutputStream(path);
		wb.write(fileout);
		fileout.close();
		
		
		
		
		
		

	}

}
