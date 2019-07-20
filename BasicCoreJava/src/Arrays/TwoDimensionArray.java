package Arrays;

public class TwoDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] arr= new String[5][2];
		
		//Row1
		arr[0][0]= "U1";
		arr[0][1]= "P1";
		
		arr[1][0]="U2";
		arr[1][1]="P2";
		
		arr[2][0]= "U3";
		arr[2][1]= "P3";
		
		arr[3][0]= "U4";
		arr[3][1]= "P4";
		
		arr[4][0]="U5";
		arr[4][1]= "P5";
		
		for (int i=0; i<arr.length;i++)
		{
			for (int j=0; j<arr[0].length;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
		
		
				

	}

}
