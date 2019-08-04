package testScripts;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import configuration.Config;
import pages.BookFlight;
import pages.FlightConfirmation;
import pages.FlightDetails;
import pages.SelectFlight;
import utilities.Xls_Reader;

public class Oneway{
	public String ActualString;
	
	
	
	@Test
	public void onepersoneway() throws InterruptedException
	{
		System.out.println("In onepersoneway method");
		FlightDetails fd = new FlightDetails(loginTest.dr);
		fd.Onepersononeway();
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
	
	
	public void oneperstwoway() throws InterruptedException
	{
		System.out.println("In oneperstwoway method");
		
		FlightDetails fd = new FlightDetails(loginTest.dr);
		System.out.println("Clicked on Round Trip");
		fd.Onepersontwoway();
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
	
	@AfterTest
	public void SetStatus() throws IOException
	{
		Xls_Reader obj = new Xls_Reader(Config.testdata);
		
		int rows = obj.getrowcount("MercuryData");
		int cols=obj.getColumncount("MercuryData");
		
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				obj.setCellData("MercuryData", "Actual", r, ActualString);
				if(ActualString.equalsIgnoreCase(Config.Expectedstring))
				{
				obj.setCellData("MercuryData", "Status", r, "Pass");
				}
				else
				{
					obj.setCellData("MercuryData", "Status", r, "Fail");
				}
			}
		}
		
	}

	
	
	}
	
	
	


