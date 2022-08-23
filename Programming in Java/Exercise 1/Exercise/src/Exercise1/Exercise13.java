package Exercise1;

public class Exercise13 {
	public static void main(String[] args) {
		// Create five integer variables
		// Set the value of the first variable to 1
		// Set the value of each subsequent variable to twice (2×) the value of the previous one.
		int val1 = 1;
		int val2 = val1 * 2;
		int val3 = val2 * 2;
		int val4 = val3 * 2;
		int val5 = val4 * 2;
		
		// Output the sum of the five variables.
		int sum = val1 + val2 + val3 + val4 + val5;
		
		// Compute the mean of the five variables and output the result.
		float result = (float) sum / 5;
		
		System.out.println("Sum of five variables is " + sum);
		System.out.println("Maen of five variables is " + result);
	}
}