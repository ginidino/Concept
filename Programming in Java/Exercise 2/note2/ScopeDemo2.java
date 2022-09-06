package note2;

public class ScopeDemo2 {
	public static void main(String[] args) {
		int i = 0; 
		int j = 2;
		
		if (i < j) {
			int k = 5;
			
			if (i < k) {
				k++; 	// accessible here
				int m = 7;
			} else {
				k--;
			}
			//m++;	//oops. Not accessible here
		}
	}
}