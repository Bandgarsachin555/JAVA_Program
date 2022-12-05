package JAVA;

import java.util.Scanner;

public class palindrom_Number {

	public static void main(String[] args) {
		// bacical we are checking here if no is reverce ,those reverece and and original number both should be same then and then should be palindrom
		
		 Scanner scan=new Scanner(System.in);
		 System.out.println("prinm number");
		 //121
		int num= scan.nextInt();
		int o_num=num;
	    int	rev=0;
      while(num!=0)
      {
    	  rev=rev *10+num%10;
    	  num=num/10;
      }
      System.out.println(rev);
     
      if(o_num==rev)
      {
    	System.out.println("this is palindrom"); 
      }
      else
      {
    	  System.out.println("this is not palindrom");  
      }
	}

}
