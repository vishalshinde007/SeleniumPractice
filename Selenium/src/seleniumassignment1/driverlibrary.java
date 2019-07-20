package seleniumassignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverlibrary {
	
	public WebDriver browser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\TechBodhi\\chromedriver.exe");
        ChromeDriver dr=new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("http://www.newtours.demoaut.com/");
		
		return dr;
	}

}
