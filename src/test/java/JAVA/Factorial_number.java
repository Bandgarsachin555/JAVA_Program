package JAVA;

public class Factorial_number {

	public static void main(String[] args) {
		// it is function a multiplies a number a every number below it
		//5= 1*2*3*4*5=120
		
		int num=5;
		long fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
System.out.println(fact);
	}

}
