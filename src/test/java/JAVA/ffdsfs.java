package JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class ffdsfs {
  
		public static void main(String[] arr)
	{
			String c="5341";
			int num=Integer.parseInt(c);
			//int num=5341;
			int sum=0;
			while(num>0)
			{
				sum=sum+num%10;
				num=num/10;
				
			}
			System.out.println(sum);
			
	}}