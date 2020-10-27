package interview;

import java.util.Arrays;

public class Question4 {
	
	
	public static void main(String...args) {
		int [] arr= {1,5,7,-100,58655,147777};
		Arrays.sort(arr);
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);
	
	
		
	

	
	maxNumber(arr);
	
	
	}
		
	
	public static void maxNumber(int[]arr) {
        int max=0;
		
		for(int i:arr) {
			
			if(i>max) {
				
				max=i;
				
			}
			
			
	}System.out.println(max);
	
}}
	
	


