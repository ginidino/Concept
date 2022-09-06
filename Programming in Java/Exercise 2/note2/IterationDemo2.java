package note2;

import java.util.Scanner;

public class IterationDemo2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter an integer value.");
		int numIterations = reader.nextInt();
		
		int i = 0;
		
		while (i < numIterations) {
			System.out.println("The value of i is " + i);
            i++;
		}
	}
}