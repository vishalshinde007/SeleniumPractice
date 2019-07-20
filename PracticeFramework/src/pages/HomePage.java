package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	
	public class HomePage {
		
		WebDriver dr;
		
		By useranme = By.name("userName");
		By password=By.name("password");
		By login=By.name("login");
		
		public HomePage(WebDriver dr)
		{
			this.dr=dr;
		}
		
		public void login(String username, String password)
		{
			System.out.println("Homepage Login Method");
			System.out.println("Username :" +username);
			System.out.println("Password:" +password);
			dr.findElement(this.useranme).sendKeys(username);
			dr.findElement(this.password).sendKeys(password);
			dr.findElement(login).click();
		}

	}


