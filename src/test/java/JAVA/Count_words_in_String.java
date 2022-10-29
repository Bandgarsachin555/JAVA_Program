package JAVA;

public class Count_words_in_String {

	public static void main(String[] args) {


		String str="sachin bandgar dorli";
		
		//Approch 1
		//count only words
	String [] abc=	str.split(" ");
	
	    System.out.println(abc.length);

	    

		
//Approch 2
	    //count total character except spaace 
		str=str.replaceAll(" ", "");
		System.out.println(str.length());
	   
	    
	}

}
