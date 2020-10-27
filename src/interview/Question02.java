package interview;

public class Question02 {
	
	
	public static void main(String...args) {
		
		
		
		int number=855885;
		int sum=0;
		
		while(number>0) {
			
			sum=sum+number%10;
			number=number/10;
			
		}System.out.println(sum);
		
		
//bir sayinin reverseni alma 
		
		
		
		int number1=855885;
		int sum1=0;
		
		while(number1>0) {
			
			sum1=sum1*10+number1%10;
			number1=number1/10;
			
		}System.out.println(sum1);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
