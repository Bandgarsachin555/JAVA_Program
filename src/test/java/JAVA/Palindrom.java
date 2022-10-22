package JAVA;

public class Palindrom {

	public static void main(String[] args) {
		
		String a="Madam";
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("this is palindrome word");
		}
		else
		{
			System.out.println("this is not palindrome word");
		}
	}

}
