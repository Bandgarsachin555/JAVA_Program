package JAVA;

public class swaping_Number {

	public static void main(String[] args) {
		//Swaping number with 3rd variable
	   //Approch 1
		int a=77,b=99,c=0;
		c=a;
		a=b;
		b=c;
		System.out.println(a +" "+b);
		//Swaping number without 3rd variable
		   //Approch 2
		
		int d=22,e=20;
		
		d=d+e;//42
		e=d-e;//22 
		d=d-e;//20
		
		System.out.println(d +"  "+e);
		
		
	}

}
