package note2;

import java.util.Scanner;

public class IterationDemo3 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int numIterations = 0;
		do {
			System.out.println("Please enter a number. -1 to quit.");
			numIterations = reader.nextInt();
			
			int i = 0;
			
			while (i < numIterations) {
				System.out.println("The value of i is " + i);
				i++;
			}
		} while (numIterations >= 0);
	}
}