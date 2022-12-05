package JAVA_Aditional_Program;

import java.util.Arrays;

public class Array_sort {

	public static void main(String[] args) {
		int []a={41,2,3,4,5,99};
		
		  
		  int temp=0;
		  for(int i=0;i<a.length;i++)
		  {
			  for(int j=i+1;j<a.length;j++)
			  {
				  if(a[i]<a[j])
				  {
					 temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				  }
			  }
			  
		  }
		  for(int g=0;g<a.length;g++)
		  {
			  System.out.println(a[g]);
		  }
	}

}
