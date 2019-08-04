package testScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import libraries.ApplicationLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import configuration.Config;
import pages.BookFlight;
import pages.FlightConfirmation;
import pages.FlightDetails;
import pages.HomePage;
import pages.SelectFlight;
import utilities.Xls_Reader;

public class loginTest {
	
	String username;
	String password;
	ApplicationLibraries lib;
	public static WebDriver dr;
	
	@BeforeSuite
	public void launch()
	{
		lib =new ApplicationLibraries();
		dr=lib.launchbrowser();
		//dr.manage().deleteAllCookies();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
		
		
	
	@Test(dataProvider="getdata2")
	public void logintest(String username, String password)
	{
		System.out.println("logintest method");
		/*ApplicationLibraries lib =new ApplicationLibraries();
		WebDriver dr=lib.launchbrowser();*/
		
		System.out.println("LoginUsername"+username);
		System.out.println("LoginUsername"+password);
      	   
        HomePage page1= new HomePage(dr);
        page1.login(username, password);
          
        
        }
	
	
	
	

@DataProvider
public String[][] getdata2() throws IOException
{
	
	Xls_Reader obj = new Xls_Reader(Config.testdata);
	
     
      
      int rows = obj.getrowcount("login");
      int cols = obj.getColumncount("login");
      
      String[][] data = new String[rows-1][cols];
      
      for(int r=2;r<=rows;r++)
      {
    	  for(int c=1;c<=cols;c++)
    	  {
    		  data[r-2][c-1]=obj.getCellData("login", r, c);
    	  }
    	  
      }
      
      
	return data;
	
}

@AfterSuite
public void quitbrowser()
{
	dr.quit();
	System.out.println("After Suite");
}

}
