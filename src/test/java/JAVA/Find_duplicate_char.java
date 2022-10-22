package JAVA;

public class Find_duplicate_char {

	public String abc() {
		String a = "aoitwqsi";

		String b = "";

		String c = "";

		for (int i = 0; i < a.length(); i++) {

			char ne = a.charAt(i);///

			if (b.indexOf(ne) < 0)// remove duplicate char
			{
				b = b + ne;

			} else if (c.indexOf(ne) < 0)// find duplicate char
			{
				c = c + ne;
			}

		}

		return c;
	}

	public static void main(String[] args) {

		Find_duplicate_char h = new Find_duplicate_char();

		System.out.println(h.abc());

	}
}