package JAVA_Aditional_Program;

public class Array_element_copy {

	
	public static void main(String []kj)
	{
		//Program to copy all elements of one array into another array
		
		int [] abc= {1,2,3,4};
		
		int [] ab=new int[4];
		for(int i=0;i<abc.length;i++)
		{
			ab[i]=abc[i];
		}
		for (int i = 0; i < ab.length; i++) 
		{     
	           System.out.print(ab[i] + " ");    
	}
}
}