package pe;

public class Factorial {
	public static int[] findIntFactorial(int factorial) {
		int factorialArray[] = new int[factorial];
		int i, temp;
		for(i=factorial-1; i>=0; i--, factorial--) {
			factorialArray[i] = 1;
			temp = factorial;
			while(temp>0) {
				factorialArray[i]*=temp;
				temp--;		
			}
		}
		
		return factorialArray;
	}
	
	public static long[] findLongFactorial(int factorial) {
		long factorialArray[] = new long[factorial];
		int i, temp;
		for(i=factorial-1; i>=0; i--, factorial--) {
			factorialArray[i] = 1;
			temp = factorial;
			while(temp>0) {
				factorialArray[i]*=temp;
				temp--;		
			}
		}
		return factorialArray;
	}
	
}
