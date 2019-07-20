package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Library lib =new Library();

WebDriver dr= lib.launchbrowser();

/*dr.findElement(By.name("userName")).sendKeys("mercury");
dr.findElement(By.name("password")).sendKeys("mercury");
dr.findElement(By.name("login")).click();*/

List<WebElement> Rowslist=  dr.findElements(By.xpath("//table[@border='2']/tbody/tr"));
List<WebElement> Columnlist=  dr.findElements(By.xpath("//table[@border='2']/tbody/tr[1]/td"));

int rows =Rowslist.size();
int col=Columnlist.size();

System.out.println("rows" +rows);
System.out.println("col" + col);

for(int r=1;r<=rows;r++)
{
	for(int c=1;c<=col;c++)
	{
		String val= dr.findElement(By.xpath("//table[@border='2']/tbody/tr["+r+"]/td["+c+"]")).getText();

		System.out.println(val);

		
	}
}




	}

}
