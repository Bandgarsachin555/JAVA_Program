package JAVA;

import java.util.Scanner;

public class Scanner_ReverceStringAtSamePosition {

	public static void main(String[] args) {
		
		// Reverse String on Same Position
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter String ");
				
				String a =sc.nextLine(); //amol kumbhar 
				//System.out.println(a);
				
				String d[]=a.split(" "); //store amol as 0 position
			 	
				String b="";
				
				for(String c:d)//0=amol 1=kumbhar
				{
					String z="";
					for(int i=c.length()-1;i>=0;i--)
					{
						z=z+c.charAt(i);
					}
					b=b+z+"";
				}
				System.out.println(b);
				
			}

		}