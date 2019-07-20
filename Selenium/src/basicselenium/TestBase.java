package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestBase {
	
	public String str = null;
	public String str2= null;
	
	public ChromeDriver dr=new ChromeDriver();
	
	
	
	
		
	public TestBase(String URL) 
	{
		dr.manage().window().maximize();
		dr.get(URL);
		
	}

	public void TestLogin(String username, String password)
	{
		dr.findElement(By.name("userName")).sendKeys(username);
		dr.findElement(By.name("password")).sendKeys(password);
		dr.findElement(By.name("login")).click();
	}
	
	public void OneWay() throws InterruptedException
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
		
		dr.findElementByXPath("//img[@src='/images/forms/backtoflights.gif']").click();
		
		System.out.println("Clicked on BAck to Flights");
	}
	
	public void Twoway() throws InterruptedException
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
	
	public String getstringvalue()
	{
		String Actualvalue= dr.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")).getText();
		
		return Actualvalue;
	}

}
