package interview;

public class Question7 {

	public static void main(String[] args) {
		
		
		String a = "ey metin ye";
		String b ="";
		
		for(int i =a.length()-1;i>=0;i--) {
			b = b + a.charAt(i);
			
		}
		if(a.equals(b)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
		StringBuilder str = new StringBuilder(a);
		String s = str.reverse().toString();
		
		if(a.equals(s)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
	
		
		
		
		
		

	}

}
