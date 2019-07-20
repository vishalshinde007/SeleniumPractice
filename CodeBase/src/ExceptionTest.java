
public class ExceptionTest {
	
	
		public static void main(String[] args) {
		try {
		int num1, num2;
		num2 = 10;
		for (num1 = -1; num1 < 5;++num1) {
		num2 = (num2 / num1);
		System.out.print(num1);
		}
		}
		catch(Exception e){
		System.out.println("Error occurred");
		}
		catch(ArithmeticException e) { 
		System.out.print("0");
		}
		}
		}


