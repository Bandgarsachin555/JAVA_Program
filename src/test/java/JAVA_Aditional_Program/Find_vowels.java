package JAVA_Aditional_Program;

public class Find_vowels {

	public static void main(String[] args) {
		String str = "This is a really simple sentence";  
		int count=0;
		for(int ii=0;ii<str.length();ii++)
		{
			char c=str.charAt(ii);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
