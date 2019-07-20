package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectFlight {
	
	WebDriver dr;
		
	By reserveFlights=By.name("reserveFlights");
	
	public SelectFlight(WebDriver dr)
	{
		this.dr=dr;
	}
	
	public void reserveFlights() throws InterruptedException
	{
		Thread.sleep(2000);
		dr.findElement(this.reserveFlights).click();
		
	}

}
