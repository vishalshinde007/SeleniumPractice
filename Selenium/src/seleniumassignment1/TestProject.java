package seleniumassignment1;

import java.io.IOException;

import basicselenium.Xls_Reader;

public class TestProject {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		TestBase1 tb = new TestBase1();
		
		tb.Testlogin("login");
		tb.Onepersononeway();
		tb.Reader("Sheet4", "Actual", 2,3,"Status");
		tb.backhome();
		tb.onepersontwoway();
		tb.Reader("Sheet4", "Actual", 3,3,"Status");
		tb.backhome();
		tb.Twopersononeway();
		tb.Reader("Sheet4", "Actual", 4,3,"Status");
		tb.backhome();
		tb.Twopersontwoway();
		tb.Reader("Sheet4", "Actual", 5,3,"Status");
		tb.backhome();
	}

}
