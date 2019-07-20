package basicselenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TwoPassengoneWay {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\TechBodhi\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		
		 dr.get("http://www.newtours.demoaut.com/");
		
		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");
		dr.findElement(By.name("login")).click();
		
		dr.findElement(By.xpath("//input[@value='oneway']")).click();
		
		Select sel= new Select(dr.findElement(By.xpath("//select[@name='passCount']")));
		
		sel.selectByIndex(2);
		Thread.sleep(2000);
		
				
		dr.findElement(By.xpath("//input[@name='findFlights']")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//input[@name='buyFlights']")).click();
		Thread.sleep(2000);
		

			
	System.out.println(dr.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")).getText());
	String Actualvalue= dr.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")).getText();


	//Code for writing data in excel
	String path = (System.getProperty("user.dir")+"\\src\\basicselenium\\TestData3.xls");

	FileInputStream file = new FileInputStream(path);
	HSSFWorkbook wb = new HSSFWorkbook(file);
	HSSFSheet sheet=wb.getSheet("Sheet4");
	HSSFRow row = sheet.getRow(0);
	HSSFCell cell = row.getCell(0);



	sheet.getRow(3).createCell(2).setCellValue(Actualvalue);
	System.out.println("String Actual Value =" + Actualvalue);
	String ExpectedValue= sheet.getRow(3).getCell(3).getStringCellValue();
		System.out.println("String Expected Value =" + ExpectedValue);
		
		if(Actualvalue.equalsIgnoreCase(ExpectedValue))
		{
			sheet.getRow(3).createCell(4).setCellValue("Pass");
		}else
			sheet.getRow(3).createCell(4).setCellValue("Fail");



	FileOutputStream fileout = new FileOutputStream(path);
	wb.write(fileout);
	fileout.close();

	dr.close();


		// TODO Auto-generated method stub

	}

}
