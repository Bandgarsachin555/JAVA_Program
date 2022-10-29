package JAVA;

import java.util.Scanner;

public class Reverce_number1 {

	public static void main(String[] args) {
		//Reverce no 
		Scanner scan =new Scanner (System.in);
		
		System.out.println("Enter your no");
		int num=scan.nextInt();
		
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 +num%10;//0+4=4, 40+3=43, 430+2=432 if use moduler output should be last num
			num=num/10;//23,2,0 //if use moduler output should be except last num  rest all 
			
		}
System.out.println(rev);

//using String buffer we can reverce 

StringBuffer sb=new StringBuffer(String.valueOf(num));

      System.out.println(  sb.reverse());

	}

}
