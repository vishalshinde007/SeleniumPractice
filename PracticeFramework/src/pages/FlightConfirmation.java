package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightConfirmation {
	
	WebDriver dr;
	
	
	By itinerary= By.xpath("//font[contains(text(),'Your itinerary has been booked!')]");
	
	By BackHome = By.xpath("//img[@src='/images/forms/backtoflights.gif']");
	
	public FlightConfirmation(WebDriver dr)
	{
		this.dr=dr;
	}
	
	
	
	public String ActualString()
	{
	String ActualValue=	dr.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")).getText();
		//String ActualValue=	dr.findElement(By.xpath("this.itinerary")).getText();
		System.out.println("Actual String:" +ActualValue);
		return ActualValue;
	}
	
	public void Backhome() throws InterruptedException
	{
		
		//dr.findElement(By.xpath("//img[@src='/images/forms/backtoflights.gif']")).click();
		dr.findElement(this.BackHome).click();
	}

	
}
