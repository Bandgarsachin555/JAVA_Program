 package JAVA_Aditional_Program;

public class Find_3rd_Array_no {

	public static void main(String[] args) {
		//find 3rd largest number
		
		int []abc={41,2,3,4,5};
		int a =abc.length;
		int temp;
		for(int i=0;i<a;i++)
		{
			for(int j=i+1;j<a;j++)
			{
				if(abc[i]<abc[j])//<
				{
					temp=abc[i];
					abc[i]=abc[j];
					abc[j]=temp;
					
				}
			}
		}
//for(int i=0;i<abc.length;i++)
//			
//		{
//			System.out.print(abc[i]+" ");
//		}
System.out.println(abc[a-5]);
	}

}
