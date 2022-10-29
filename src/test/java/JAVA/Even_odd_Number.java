package JAVA;

public class Even_odd_Number {

	public static void main(String[] args) {
		// find even and odd number
		
		int num=91;
		int even =0;
		int odd =0;
         while(num>0)
         {
        	 num=num%10;//divided by 10 
        	 if(num%2==0)//and use divedeb by 2.....
        	 {
        		  even++;
        		  System.out.println("even");
        		  
        	 }	
        	 else
        	 {
        		 odd++;
        		 System.out.println("odd");
        	 }
        	 num=num/10;
        	 
         }
         //System.out.println(even);
	}

}
//0 to 100 you can use for loop and itrate all number