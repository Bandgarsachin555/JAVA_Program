package JAVA;

public class Fibinacci_series {

	public static void main(String[] args) {
		// it is series each number is the sum of two preceding numbes
		
         
		int n1=0,n2=1, sum=0;
		
		for(int i=2;i<6;i++)
		{
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;//resassign value to n1
			n2=sum;//reassign value to n2
		}
	
	}

}
