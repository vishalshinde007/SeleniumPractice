package Arrays;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1= {1,2,3,4,2,4,5};
		
		//Find duplicate : 2 & 4 are duplicate
		//Unique nos : 12345
		
		for (int i=0; i<arr1.length;i++)
		{
			if(arr1[i]==i)
			{
				System.out.println(i +"Is duplicate");
			}
			else
			{
				System.out.println(i + "Is unique");
			}
		}
	}

}
