package JAVA;

public class ReverceStringAtSamePosition {

	public static void main(String[] args) {

        String abc="sachin bandgar";
        	
        		String reverceString ="";
       String [] a= abc.split(" ");
       
       for(String w:a)
       {
    	   String reverceWord="";
    	   for(int i=w.length()-1;i>=0;i--)
    	   {
    		   reverceWord=reverceWord+w.charAt(i);
    		   //System.out.println(reverceWord);
    	   }
    	   
    	   reverceString=reverceString+reverceWord+" ";
    	   
       }
       System.out.println(reverceString);
	}

}
