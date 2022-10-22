package JAVA;

import java.util.Scanner;

public class reverce_number {

	public static void main(String[] args) {

     
		Scanner ne= new Scanner(System.in);
				
				System.out.println("enterno");
				
			int number=ne.nextInt();
			
			int reverce=0;
			
			while(number!=0)
			{
				int reminder =number%10;
				
				reverce =reverce*10+reminder;
				number=number/10;
			}
			System.out.println(reverce);
			
				
		
		
	}

}
