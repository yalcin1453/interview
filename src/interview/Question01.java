package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Question01 {
	
	
	public static void main(String...args) {
		
		String str="aaaaa  bbbbbcccc ddddeeee";
		str=str.replace(" ", "");
		System.out.println(str);
		String [] arr=str.split("");
		System.out.println(Arrays.toString(arr));
		Map<String,Integer> map= new HashMap<>();
		
		for(String x:arr) {
			if(map.containsKey(x)) {
				
				map.put(x,map.get(x)+1);
				
				
			}else {
				map.put(x, 1);
				
				
			}
			
		
			
		}	System.out.println(map);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
