package note2;

public class ScopeDemo1 {
	public static void main(String[] args) {
		// this variable is in scope throughout the main method
		int i = 0;
		
		// so is this one
		int j = 2;
		
		if (i < j) {
			i += 4; 	// i is in scope here, so this is fine
		} else {
			int k = 5; 	// k is declared inside the else block k *= j;
		}
		
		System.out.println("i = " + i); // fine 
		System.out.println("j = " + j); // fine 
		//System.out.println("k = " + k); // ummm
	}
}