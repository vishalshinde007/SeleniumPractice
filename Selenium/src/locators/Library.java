package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Library {
	
	public WebDriver launchbrowser()
	{
System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("http://www.newtours.demoaut.com/");
		
		return dr;
	}
	
	public WebDriver launchbrowser(String url)
	{
System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");

ChromeOptions op = new ChromeOptions();

op.addArguments("--disable-infobars");
op.addArguments("--start-maximized");
		
		ChromeDriver dr=new ChromeDriver(op);
		
		//dr.manage().window().maximize();
		
		dr.get(url);
		
		return dr;
	}

}
