package pe;

public class Factorial {
	public static int findIntFactorial(int a) {
		int factorial = 1;
		while(a>0) {
			factorial*=a;
			a--;		
		}
		return factorial;
	}
	
	public static long findLongFactorial(int a) {
		long factorial = (long) 1;
		while(a>0) {
			factorial*=a;
			a--;	
		}
		return factorial;
	}
	
}
