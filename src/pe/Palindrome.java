package pe;

public class Palindrome {
	public static String reverse(int a) {
		int num =a, rem, sum=0;
		String s ;
		while(num>0) {
			rem = num%10;
			sum = sum*10 + rem;
			num /= 10;
		}
		s = String.valueOf(sum);
		return s;
	}
		
	public static String reverse(String a) {
		int i, l;
		l=a.length();
		String reverse = "";
		for(i=l-1; i>=0; i--)
			reverse+=a.charAt(i);
		System.out.println(reverse);
		return reverse;	
		
	}
	
	public static boolean paliandrome(String expected, String actual) {
		if(expected.equals(actual))
			return true;
		else 
			return false;
	}

}
