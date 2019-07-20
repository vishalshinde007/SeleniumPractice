package basicselenium;

import java.io.IOException;

public class OnepOneWay extends TestBase{
	
		
	public void excelreader() throws IOException
	{
	Xls_Reader obj1 = new Xls_Reader("D:\\MyWorkspace\\Selenium\\src\\basicselenium\\TestData3.xls");
	
	String str= obj1.getCellData("Sheet4", 1, 5);
    System.out.println(str);
    
    String str2= obj1.getCellData("Sheet4", 2, "Expected");
    System.out.println(str2);
    
    //obj1.setCellData("Sheet4", "LastName", 3, "Shinde1");
        	
	}

	
}
