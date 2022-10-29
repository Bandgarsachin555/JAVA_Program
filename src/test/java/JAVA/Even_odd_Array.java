package JAVA;

public class Even_odd_Array {

	public static void main(String[] args) {
		// check Array if even or odd number
		
            int [] abc= {1,3,4,7,9};
            
            for(int abc1:abc)
            {
            	if(abc1%2==0)
            	{
            		System.out.println("even" +abc1);
            	}
            	else
            	{
            		System.out.println("odd" +abc1);
            	}
            }
	}

}
