package seleniumassignment1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import basicselenium.Xls_Reader;

public class TestBase1 {
	
	driverlibrary lib = new driverlibrary();
	WebDriver dr = lib.browser();
	String Actualvalue, Expectedvalue;
	Xls_Reader reader= new Xls_Reader("D:\\MyWorkspace\\Selenium\\src\\basicselenium\\TestData3.xls");
	
	public void Testlogin(String Sheetname) throws IOException
	{
		String username=reader.getCellData(Sheetname, 2, "Username");
		String password=reader.getCellData(Sheetname, 2, "Password");
		
		dr.findElement(By.name("userName")).sendKeys(username);
		dr.findElement(By.name("password")).sendKeys(password);
		dr.findElement(By.name("login")).click();
	}
	
	public void Onepersononeway() throws InterruptedException
	{
		dr.findElement(By.xpath("//input[@value='oneway']")).click();
		Select sel= new Select(dr.findElement(By.xpath("//select[@name='passCount']")));
		
		sel.selectByIndex(2);
		Thread.sleep(2000);
		System.out.println("value selected");
		
		dr.findElement(By.xpath("//input[@name='findFlights']")).click();
		System.out.println("Click on Continue");
		
		dr.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//input[@name='buyFlights']")).click();
		Thread.sleep(2000);
		
		//dr.findElement(By.xpath("//img[@src='/images/forms/backtoflights.gif']")).click();
		
		System.out.println("Clicked on BAck to Flights");
	}
	
	public void onepersontwoway() throws InterruptedException
	{
		dr.findElement(By.xpath("//input[@value='roundtrip']")).click();
		
		Select sel= new Select(dr.findElement(By.xpath("//select[@name='passCount']")));
							
		sel.selectByValue("2");
		Thread.sleep(2000);
		
		System.out.println("value selected");
				
		dr.findElement(By.xpath("//input[@name='findFlights']")).click();
		System.out.println("Click on Continue");
		
		dr.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//input[@name='buyFlights']")).click();
		Thread.sleep(2000);
		
	}
	
	public void Twopersononeway() throws InterruptedException
	{
		dr.findElement(By.xpath("//input[@value='oneway']")).click();
		Select sel= new Select(dr.findElement(By.xpath("//select[@name='passCount']")));
		
		sel.selectByIndex(2);
		Thread.sleep(2000);
		System.out.println("value selected");
		
		dr.findElement(By.xpath("//input[@name='findFlights']")).click();
		System.out.println("Click on Continue");
		
		dr.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//input[@name='buyFlights']")).click();
		Thread.sleep(2000);
		
		//dr.findElement(By.xpath("//img[@src='/images/forms/backtoflights.gif']")).click();
		
		System.out.println("Clicked on BAck to Flights");
	}
	
	public void Twopersontwoway() throws InterruptedException
	{
		dr.findElement(By.xpath("//input[@value='roundtrip']")).click();
		
		Select sel= new Select(dr.findElement(By.xpath("//select[@name='passCount']")));
							
		sel.selectByValue("2");
		Thread.sleep(2000);
		
		System.out.println("value selected");
				
		dr.findElement(By.xpath("//input[@name='findFlights']")).click();
		System.out.println("Click on Continue");
		
		dr.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//input[@name='buyFlights']")).click();
		Thread.sleep(2000);
		
	}
	
	
	public void Reader(String sheetname,String columnname, int rownum,int expectedcol, String status) throws IOException, InterruptedException
	{
		System.out.println("In Reader method");
		Thread.sleep(3000);
		
		Actualvalue=dr.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")).getText();
		System.out.println("Actual String:" +Actualvalue);
		//
		reader.setCellData(sheetname, columnname, rownum, Actualvalue);
		
		Expectedvalue= reader.getCellData(sheetname, rownum, expectedcol);
		System.out.println("Expected String:"+Expectedvalue);
		
		if(Actualvalue.equalsIgnoreCase(Expectedvalue))
		{
			reader.setCellData(sheetname, status, rownum, "Pass");
		}
		else
		{
			reader.setCellData(sheetname, status, rownum, "Fail");
		}
	}
	
	
	public void backhome() throws InterruptedException
	{
		Thread.sleep(5000);
		dr.findElement(By.xpath("//img[@src='/images/forms/backtoflights.gif']")).click();
	}
	

}
