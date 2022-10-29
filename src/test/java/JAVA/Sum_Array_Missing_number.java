package JAVA;

public class Sum_Array_Missing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sum1=0;
		int sum2=0;
		int[] abc1= {1,2,3,4,6};
		
		for(int i=0;i<abc1.length;i++)
		{
			sum1=sum1+abc1[i];
			
		}
		for(int ii=0;ii<=abc1.length+1;ii++)
		{
			sum2=sum2+ii;
			
		}
		int sum3=sum2-sum1;
		System.out.println(sum3);
	}

}
