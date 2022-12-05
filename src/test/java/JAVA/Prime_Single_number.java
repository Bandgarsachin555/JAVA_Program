package JAVA;

public class Prime_Single_number {

	public static void main(String[] args) {
		// check prime number 53
		//Number is >1
		//whic hs only 2 factors 1 and itself
		
		int no = 53;
		int count = 0;
		
		if(no>1)//compare with 1 
		{
			for(int i=1;i<=no;i++)
			{
				if(no%i==0)
				{
					//divide by each number 
					count++;//if condition is satisfy then count will be increase 
				}
			}
			
			if(count==2)//if count become 2 then prime ,and if count is gretter than 2 then it is not prime number 
			{
				System.out.println("this is prime number ");
			}
			else
			{
				System.out.println("this is not prime2 number ");
			}
		}
		else
		{
			System.out.println("this is not prime1 number ");
		}
	}

}
