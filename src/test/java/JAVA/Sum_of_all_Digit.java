package JAVA;

public class Sum_of_all_Digit {

	public static void main(String[] args) {
		// sum of all digit 
		
		int num=5341;
		int sum=0;
		while(num>0)
		{
			 sum=sum+num%10;
			num=num/10;
			
		}
System.out.println(sum);
	}

}
