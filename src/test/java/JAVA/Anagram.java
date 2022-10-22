package JAVA;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String a="secure";
		String b="Rescue";
		
        String a1=  a.toLowerCase();
        String b1= b.toLowerCase();
        
        if(a1.length()==b1.length())
        {
          char[]aa= a1.toCharArray();
          char[]bb= b1.toCharArray();
          
          Arrays.sort(aa);
          Arrays.sort(bb);
          if(Arrays.equals(aa, bb))
          {
        	  System.out.println("this word are anagram"); 
          }
          else
          {
        	  System.out.println("this word are not anagram2"); 
          }
          
        }
        else
        {
        	System. out.println("this word are not anagram1");
        }
        
	}

}
