package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import configuration.Config;

public class FlightDetails {
	
	WebDriver dr;
	
	By oneway= By.xpath("//input[@value='oneway']");
	By passengerselect = By.name("passCount");
	By findflights  = By.name("findFlights");
	
	
	

	
	public FlightDetails(WebDriver dr)
	{
		this.dr=dr;
		
		
	}
	
	
	public void Onepersononeway() throws InterruptedException
	{
		 
		 dr.findElement(this.oneway).click();
		Select sel= new Select(dr.findElement(this.passengerselect));
		
		
		sel.selectByIndex(2);
		System.out.println("value selected");
		
		dr.findElement(this.findflights).click();
		System.out.println("Click on Continue");
		
		
	}
	
	public void Onepersontwoway() throws InterruptedException
	{
		dr.findElement(By.xpath("//input[@value='roundtrip']")).click();
		
		Select sel= new Select(dr.findElement(By.xpath("//select[@name='passCount']")));
							
		sel.selectByValue("2");
			
		System.out.println("value selected");
				
		dr.findElement(By.xpath("//input[@name='findFlights']")).click();
		System.out.println("Click on Continue");
		
				
	}
	
	public void Twopersononeway() throws InterruptedException
	{
		dr.findElement(By.xpath("//input[@value='oneway']")).click();
		Select sel= new Select(dr.findElement(By.xpath("//select[@name='passCount']")));
		
		sel.selectByIndex(3);
		
		System.out.println("value selected");
		
		dr.findElement(By.xpath("//input[@name='findFlights']")).click();
		System.out.println("Click on Continue");
		
				
				
		System.out.println("Clicked on BAck to Flights");
	}
	
	public void Twopersontwoway() throws InterruptedException
	{
		dr.findElement(By.xpath("//input[@value='roundtrip']")).click();
		
		Select sel= new Select(dr.findElement(By.xpath("//select[@name='passCount']")));
							
		sel.selectByValue("4");
		
		
		System.out.println("value selected");
				
		dr.findElement(By.xpath("//input[@name='findFlights']")).click();
		System.out.println("Click on Continue");
		
				
	}

}
