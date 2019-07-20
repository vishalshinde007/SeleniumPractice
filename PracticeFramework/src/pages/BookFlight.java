package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookFlight {
	
	WebDriver dr;
	
	
	By buyFlights = By.name("buyFlights");
	
	public BookFlight(WebDriver dr)
	{
		this.dr=dr;
	}
	
	public void BuyFlight() throws InterruptedException
	{
		dr.findElement(this.buyFlights).click();
		
	}

}
