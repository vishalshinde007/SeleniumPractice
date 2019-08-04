package libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import configuration.Config;

public class ApplicationLibraries {
	
	
	public WebDriver launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver",Config.chromedriver);
		
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get(Config.appurl);
		return dr;
	}

}
