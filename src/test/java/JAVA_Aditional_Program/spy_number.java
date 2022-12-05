package JAVA_Aditional_Program;

public class spy_number {

	
	public static void main (String[]arr)
	{
		//spy_number//first do addtion and then multiplication 
		 int num=132;
		 int sum=0;
		 int mul=1;
		 while(num>0)
		 {
			sum =sum+num%10;//2+3+1//1+3+2=6
			mul=mul*num%10;//2*3*1//1*3*2=6
			num=num/10;//13,1,0
			 
		 }
		 System.out.println(sum);
		 System.out.println(mul);
		 if(sum==mul)
		 {
			 System.out.println("Spy Number in Java"+num);
		 }
		 
	}
}
