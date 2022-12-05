package JAVA_Aditional_Program;

public class Even_odd {

	public static void main(String[] args) {
		
		int a=100;
		int even=0;
		int odd=0;
		for(int i=0;i<=a;i++)
		{
			if(i%2==0)
			{
				System.out.println("even"+" "+i);
			}
			else
			{
				System.out.println("odd"+" "+i);
			}
		}
	}

}
