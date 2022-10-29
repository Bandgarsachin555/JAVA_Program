package JAVA;

public class Maxi_Min_Element_inArrays {

	public static void main(String[] args) {
		// find maximum and minimum value 
		int[] abc1= {1,2,8,4,6};
		
		int max=abc1[0];
		
		for(int i=1;i<abc1.length;i++)
		{
			if(abc1[i]>max)///maximum >, and minimum<use 
			{
				max=abc1[i];
			}
			
		}
		System.out.println(max);
		
		
	}

}
