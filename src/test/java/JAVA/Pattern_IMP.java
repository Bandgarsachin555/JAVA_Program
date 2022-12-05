package JAVA;

public class Pattern_IMP {

	public static void main(String[] args) {
		// output-abbcccdddd
		String a = "abcd";

		for (int i = 0; i < a.length(); i++)// 0
		{
			for (int j = 0; j <= i; j++)// 0
			{
				System.out.print(a.charAt(i)+"  ");

			}

    System.out.println("    ");
		}
	}

}
