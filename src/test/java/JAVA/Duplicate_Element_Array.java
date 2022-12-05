package JAVA;

public class Duplicate_Element_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String [] abc= {"sachin","bandgar","bandgar","dorli","BE","dorli"};
 
 for(int i=0;i<abc.length;i++)
 {
	 //compare one array element to other array element
	 for(int j=i+1;j<abc.length;j++)
	 {
		 //compare both 
		 if(abc[i]==(abc[j]))//or we can use equals method 
		 {
			 
			 System.out.println("duplicate array"+" "+abc[i]);
			 
		 }
		
	 }
 }
	}

}
