package JAVA;



public class count_number {

	
	public static void main(String[] args) {
		//Approch 1st way
		int a=1234676;
		int count =0;
//		String f=Integer.toString(a);r
//		System.out.println(f.length());
		
		while(a>0)
		{
			
			a=a/10;
			
			count++;
		}
		System.out.println(count);
		
	}
	
}
