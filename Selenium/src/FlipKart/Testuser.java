package FlipKart;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.Library;

public class Testuser {
	
	public static String bookname = "Selenium";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Library lib = new Library();
		WebDriver dr= lib.launchbrowser("https://www.flipkart.com/");
		String[] s; 
		int count=0;
		
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
dr.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys(bookname);
dr.findElement(By.xpath("//button[@class='vh79eN']")).click();

dr.findElement(By.xpath("//img[@alt='Selenium WebDriver 3 Practical Guide']")).click();

count=count+1;
//int size=dr.getWindowHandles().size();
//System.out.println("Print window nos" + size);

String parent=dr.getWindowHandle();

  Set <String> h= dr.getWindowHandles();
  for (String w : h)
  {
	  if(!w.equals(parent))
		  dr.switchTo().window(w);
	  
		  		  
  }
  dr.findElement(By.xpath("//button[text()='ADD TO CART']")).click();

  



	
		
		//dr.findElement(By.xpath("//a[text()='New to Flipkart? Create an account']")).click();
		
		
		/*List<WebElement> menu=dr.findElements(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"));
		
		for(WebElement w : menu)
		{
			//String val =dr.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']")).getText();
			//System.out.println("Menu Option" + val);
			
			System.out.println(w.getText());
			
						
		}*/
		

	}

}
