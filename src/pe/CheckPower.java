package pe;
import java.lang.Math;

public class CheckPower {
	public static boolean checkPower(int a) {
		for(int i=0; i<10; i++)
			if(a == Math.pow(4, i)) {
				return true;
			}	
		return false;    
	}

}
