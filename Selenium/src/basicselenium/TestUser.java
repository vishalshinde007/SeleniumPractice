package basicselenium;

import java.io.IOException;

public class TestUser {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		/*Xls_Reader obj = new Xls_Reader("D:\\MyWorkspace\\Selenium\\src\\basicselenium\\TestData3.xls");
		
		int rows = obj.getrowcount("Sheet4");
	    int cols = obj.getColumncount("Sheet4");
	    
	    String str= obj.getCellData("Sheet4", 1, 2);
	    System.out.println("str value :"+str);
	    String str2= obj.getCellData("Sheet4", 1, "LastName");
	    System.out.println("str2 value :"+str2);*/
		System.setProperty("webdriver.chrome.driver", "D:\\TechBodhi\\chromedriver.exe");
		
		System.out.println("I am in main class1");
	      TestBase tb = new TestBase("http://www.newtours.demoaut.com/");
	      
	      
	      tb.TestLogin("mercury", "mercury");
	      System.out.println("I am in TestLogin");
	      
	      tb.OneWay();
	      tb.Twoway();
	      
	      OnepOneWay tb1 = new OnepOneWay();
	      
	      
	      

	}

}
