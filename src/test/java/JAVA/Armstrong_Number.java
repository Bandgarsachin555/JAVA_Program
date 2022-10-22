package JAVA;

public class Armstrong_Number {

	public static void main(String[] args) {
		
		int no=153;
		//store in t1...coz it will save original
		int t1=no;
		int reminder;
		int result=0;
		while(no>0)
		{
			reminder=no%10;//3,5,1
			result=result+(reminder*reminder*reminder);//27,152,153,
			no=no/10;//15,1,0
			
		}
		if(t1==result)
		{
			System.out.println("Yes its Armstrong");
		}
		else
		{
			System.out.println("no its Armstrong");	
		}
	}

}
