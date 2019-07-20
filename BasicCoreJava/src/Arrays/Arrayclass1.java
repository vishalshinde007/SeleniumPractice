package Arrays;

public class Arrayclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String user = "Vishal";
		
		String[] arr = new String[10];
		arr[0]="Vishal";
		arr[1]="Anand";
		arr[2]="Pankaj";
		arr[3]="Shikha";
		arr[4]="Viraj";
		arr[5]="Bidyut";
		arr[6]="Neha";
		arr[7]="Snehal";
		arr[8]="Saloni";
		arr[9]="Vijay";
		
		//System.out.println(arr[4]);
		
		System.out.println("Size ofArray = " + arr.length);
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}

	}

}
