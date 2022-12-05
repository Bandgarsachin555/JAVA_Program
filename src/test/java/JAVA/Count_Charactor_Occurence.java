package JAVA;

public class Count_Charactor_Occurence {

	public static void main(String[] args) {
	//count 'a' character 
		String str="sachin bandgar ak";
        
		
		int total_count=str.length();//calculate with space also
		System.out.println(total_count);
		
	int after_removel_count=	str.replace("a","").length();
		int count=total_count-after_removel_count;
		System.out.println(count);
	}

}
