import java.io.*;


public class utilerias {
	public static boolean determinarPrimo (int n) {
		boolean res = true;
		if (n==1) {
			return res;
		}else {
			for(int i=2;i<n-1;i++) {
				if ( n % i == 0) {
					res= false;
					break;
				}
			}
			return res;
			
		}
	}

}
