package JAVA;

public class Remove_duplicate_charactor {

	public static void main(String[] args) {

         String a="i am sachin ";
         String b="";
         for(int i=0;i<a.length();i++)
         {
        	char charposition= a.charAt(i);
        	
        	
        	if(b.indexOf(charposition)<0)// if charactor is not present then return value is -1;
        	{                           //if charactor is present then return value is whatever present inside of "b string"
        	
        		b=b+charposition;
        		
        	}
         }
         
         System.out.println(b);

	}

}
