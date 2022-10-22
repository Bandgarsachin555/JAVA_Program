package JAVA;

public class Remove_special_charactor {

	public static void main(String[] args) {

		String abc = "sachj^&^&%$#@#@n";

		abc = abc.replaceAll("[^a-zA-Z0-9]", "");

		System.out.println(abc);
	}

}
