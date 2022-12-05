package JAVA;

public class Sum_of_all_Digit {

	public static void main(String[] args) {
		// sum of all digit 
		
		int num=5341;
		int sum=0;
		while(num>0)
		{
			 sum=sum+num%10;//0+1=1,1+4=5,5+3=8,5+8=13
			 
			num=num/10;//534,53,0
			
		}
System.out.println(sum);
	}

}
