package JAVA;

public class Character_sort {

	public static void main(String[] args) {
		
		String a="123abc456def7h";
		String op="";
		String s="";
		
	     for(int i=0;i<a.length();i++)
	     {
	    	char d= a.charAt(i);
	    	
	    	if(Character.isDigit(d))
	    	{
	    		op=op+d;
	    	}
	    	else
	    	{
	    		s=s+d;
	    	}
	     }
	     
	     System.out.println(op+s);
	}

}
