package JAVA;

public class Sum_Array_calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int [] abc= {15,55};
		//or
		int [] abc= new  int [3];
		abc[0]=15;
		abc[1]=15;
           int sum=0;
		for(int i=0;i<=abc.length-1;i++)
		{
			sum=sum+abc[i];
		}
		System.out.println(sum);
		
		//Also we can use enhance for loop ..it's very simple 
	}

}
