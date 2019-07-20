import org.openqa.selenium.chrome.ChromeDriver;



//import org.openqa.selenium.chrome.ChromeDriver;



public class LaunchBrowser {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\TechBodhi\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
		
		dr.get("http://www.newtours.demoaut.com/");
		
		

	}

}
