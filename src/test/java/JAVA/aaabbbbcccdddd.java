package JAVA;

import java.util.Arrays;

public class aaabbbbcccdddd {

	public static void main(String[] args) {
		//output-a3b4c3d4
String s = "aaabbbbcccdddd";
		
	    int a=0,b=0,c=0,d=0;
	    
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch=='a')
		{
			a++;
		}
		else if(ch=='b')
		{
			b++;
		}
		else if(ch=='c')
		{
			c++;
		}
		else if(ch=='d')
		{
			d++;
		}
	}
	System.out.println("a"+a+"b"+b+"c"+c+"d"+d);
	}

}
