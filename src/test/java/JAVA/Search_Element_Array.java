package JAVA;

public class Search_Element_Array {

	public static void main(String[] args) {

		int[] abc = { 10, 50, 30, 30, 40 };

		int search_element = 30;
		int count = 0;
		for (int i = 0; i < abc.length; i++)
		{
			if (abc[i] == search_element)
			{
				count = count + 1;// we can count also

				System.out.println("yes elements is match" + abc[i]);

			} else 
			{
				// System.out.println("no elements is match"+abc[i]);
			}

		}
		System.out.println(count);
	}

}
