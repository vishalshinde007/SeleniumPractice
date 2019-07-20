package logicTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.Xls_Reader;
import configuration.Config;

public class dataproviderconcept {
	
	@Test(dataProvider="getdata2")
	public void loginTest(String username, String password)
	{
		System.out.println("Enter username="+username);
		System.out.println("Enter password"+password);
		System.out.println("Login Successfull");
		System.out.println("*************************");
	}
	
	@DataProvider
	public String[][] getdata()
	{
		String[][] data = new String[3][2];
		
		//Row1
		
		data[0][0]="user1";
		data[0][1]="passowrd1";
		
		data[1][0]="user2";
		data[1][1]="passowrd2";
		
		data[2][0]="user3";
		data[2][1]="passowrd3";
		
		return data;
		
		
	}
	
	@DataProvider
	
	public void getdata3() throws IOException
	{
		Xls_Reader obj = new Xls_Reader(Config.testdata);
		
		String username = obj.getCellData("login", 2, 1);
		String password = obj.getCellData("login", 2, 2);
		String Expectedvalue= obj.getCellData("MercuryData", 2, 4);
		
	}
	
	
	
	

}
