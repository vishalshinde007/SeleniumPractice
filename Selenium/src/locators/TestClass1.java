package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("http://www.newtours.demoaut.com/");
		
		dr.findElementByCssSelector("input[name='userName']").sendKeys("abcde");
		dr.findElementByCssSelector("input[name='password']").sendKeys("asdfgg");
		
		dr.findElement(By.name("login")).click();
		
		//Link and Partial Link
		
		//dr.findElement(By.linkText("REGISTER")).click();
		
		//Partial Link Text
		
		//dr.findElement(By.partialLinkText("REGIS")).click();
		
		//Xpath
		
		String w=dr.findElement(By.xpath("//img[@src='/images/nav/logo.gif']")).getAttribute("width");
		String h=dr.findElement(By.xpath("//img[@src='/images/nav/logo.gif']")).getAttribute("height");
System.out.println(w);
System.out.println(h);
	}

}
