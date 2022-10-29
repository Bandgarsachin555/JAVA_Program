package JAVA;

import java.util.Arrays;

public class Array_sort {

	public static void main(String[] args) {
	
String [] array1= {"sachin","bandu","kaku","kaki"};
		
		for(String w:array1)
		{
			System.out.print(w+"===");
		}
		
        Arrays.sort(array1);
        for(String t:array1)
		{
			System.out.print(t+"===");
		}
      //also we cn use below 
    Arrays.parallelSort(array1);
    System.out.println(Arrays.toString(array1));
    
		
		
		
	}

}
