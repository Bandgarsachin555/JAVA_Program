package JAVA;

import java.util.Scanner;

public class Palindrom_String_words {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter String ");
		
			String str=scan.nextLine();
			
			String rev="";
			String f=str.toLowerCase();
			for(int i=f.length()-1;i>=0;i--)
			{
				rev=rev+f.charAt(i);
			}
			
			if(f.equals(rev))
			{
				System.out.println("this is palindrome String");
			}
			else
			{
				System.out.println("this is not palindrome String");
			}
			
	}

}
