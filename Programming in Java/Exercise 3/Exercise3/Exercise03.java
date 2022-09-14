package Exercise3;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int NUM_STRINGS = 10;
		String[] numString = new String[NUM_STRINGS];
		int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	    int count = 0;
	    
	    System.out.println("Enter a String. Type ’quit’ to quit.");
	    String word = reader.nextLine();
	    
	    while (!word.equals("quit") && count < NUM_STRINGS) {
	    	numString[count++] = word;
	    	
	    	if (word.length() > max) {
	    		max = word.length();
	    	} else if (word.length() < min) {
	    		min = word.length();
	    	}
	    	
	    	word = reader.nextLine();
	    }
	    System.out.println();
	    
	    for (int i = 0; i < count; i++) {
	    	System.out.println(numString[i]);
	    }
	    
	    System.out.println("Number of strings entered: " + count);
	    System.out.println("Max string length: " + max);
	    System.out.println("Min string length: " + min);
	}
}