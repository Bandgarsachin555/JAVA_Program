package JAVA;

public class Maxi_Min_Element_inArrays {

	public static void main(String[] args) {
		//three way we can perform .....................................................
		// find maximum and minimum value 
		int[] abc1= {1,2,8,4,6};
		//use enhance for loop ..it's is better 
		int max=abc1[0];
		
		for(int i=1;i<abc1.length;i++)
		{
			if(abc1[i]>max)///maximum >, and minimum<use 
			{
				max=abc1[i];
			}
			
		}
		System.out.println(max);
//---------------------------------------------------------------------------------------------------------------		
//		//String array
//		String []abc= {"sachin","band","okioi","o"};
//		
//	    String min=abc[0];
//	    System.out.println(abc.length);
//	    for(int i=0;i<abc.length;i++)
//	    {
//	    	if(min.length()>abc[i].length())//take length of each
//	    	{
//	    		min=abc[i];
//	    	}
//
//	    }
//	    System.out.println(min);
//		----------------------------------------------------------------------------------------------------------
//		  String abc1="sachin bang ok";
//		String []abc=abc1.split(" ");
//    String min=abc[0];
//    System.out.println(abc.length);
//    for(int i=0;i<abc.length;i++)
//    {
//    	if(min.length()<abc[i].length())//take length of each
//    	{
//    		min=abc[i];
//    	}
//
//    }
//    System.out.println(min);
	}

}
