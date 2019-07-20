package Arrays;

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Object is superclass of all classes so we can store different types

		Object[] arr = new Object[4];
		
		arr[0]=1;
		arr[1]="Anand";
		arr[2]= "true";
		arr[3]=3.45;
		
		for (int i=arr.length-1; i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}

}
