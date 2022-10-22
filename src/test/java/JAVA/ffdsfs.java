package JAVA;

public class ffdsfs {

	public static void main(String[] args) {
		String a="sasass";
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println(b);
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}
