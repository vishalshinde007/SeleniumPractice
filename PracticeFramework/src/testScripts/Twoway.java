package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import configuration.Config;
import pages.BookFlight;
import pages.FlightConfirmation;
import pages.FlightDetails;
import pages.SelectFlight;

public class Twoway {
	
	public String ActualString;
	
	
	
	
	@Test
	public void Twopersoneway() throws InterruptedException
	{
		System.out.println("In TwopersTwoway method");
		FlightDetails fd = new FlightDetails(loginTest.dr);
		fd.Twopersononeway();
		SelectFlight sf = new SelectFlight(loginTest.dr);
		sf.reserveFlights();
		BookFlight bf = new BookFlight(loginTest.dr);
		bf.BuyFlight();
		FlightConfirmation fc = new FlightConfirmation(loginTest.dr);
		ActualString=fc.ActualString();
		
		SoftAssert Assert = new SoftAssert();
		Assert.assertEquals(ActualString, Config.Expectedstring);
		System.out.println("Actual String:"+ActualString);
		System.out.println("Expected String:"+Config.Expectedstring);
		
		fc.Backhome();
				
	}
	
	@Test
	public void Twopersontwoway() throws InterruptedException
	{
		System.out.println("In Twoperstwoway method");
		FlightDetails fd = new FlightDetails(loginTest.dr);
		System.out.println("Clicked on Round Trip");
		fd.Twopersontwoway();
		SelectFlight sf = new SelectFlight(loginTest.dr);
		sf.reserveFlights();
		System.out.println("Clicked on Reseve Flights");
		BookFlight bf = new BookFlight(loginTest.dr);
		bf.BuyFlight();
		FlightConfirmation fc = new FlightConfirmation(loginTest.dr);
		ActualString=fc.ActualString();
		
		SoftAssert Assert = new SoftAssert();
		Assert.assertEquals(ActualString, Config.Expectedstring);
		System.out.println("Actual String:"+ActualString);
		System.out.println("Expected String:"+Config.Expectedstring);
		
		fc.Backhome();
		
					
	}

}
