package basicselenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTest {

	//public static ChromeDriver dr =null;
	ChromeDriver dr=new ChromeDriver();
	
public LaunchTest()
{
		
		System.setProperty("webdriver.chrome.driver", "D:\\TechBodhi\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://www.newtours.demoaut.com/");
				
}



public void oneway()
{
	dr.findElement(By.xpath("//input[@value='oneway']")).click();
}

public void twoway()
{
	dr.findElement(By.xpath("//input[@value='roundtrip']")).click();
}

public void stringvalidation(String path, int getrowid, int createcellid, int cellindex ) throws IOException
{
	path = (System.getProperty("user.dir")+"\\src\\basicselenium\\TestData3.xls");
	FileInputStream file = new FileInputStream(path);
	HSSFWorkbook wb = new HSSFWorkbook(file);
	HSSFSheet sheet=wb.getSheet("Sheet4");
	HSSFRow row = sheet.getRow(0);
	HSSFCell cell = row.getCell(0);
	String Actualvalue= dr.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")).getText();



	sheet.getRow(getrowid).createCell(createcellid).setCellValue(Actualvalue);
	System.out.println("String Actual Value =" + Actualvalue);
	String ExpectedValue= sheet.getRow(getrowid).getCell(createcellid).getStringCellValue();
		System.out.println("String Expected Value =" + ExpectedValue);
		
		if(Actualvalue.equalsIgnoreCase(ExpectedValue))
		{
			sheet.getRow(getrowid).createCell(cellindex).setCellValue("Pass");
		}else
			sheet.getRow(getrowid).createCell(cellindex).setCellValue("Fail");



	FileOutputStream fileout = new FileOutputStream(path);
	wb.write(fileout);
	fileout.close();

	dr.close();
}

	

}
