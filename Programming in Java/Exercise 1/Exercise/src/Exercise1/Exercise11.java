package Exercise1;

public class Exercise11 {
	public static void main(String[] args) {
		// Create an integer variable called num1 and initialise it 4.
		int num1 = 4;
		
		// Create another integer variable called num2 and initialise it 6.
		int num2 = 6;
		
		// Create another integer variable called num3 and initialise it 3.
		int num3 = 3;
		
		// Assign the result of summing num1 and num2 to a new integer variable called sum1.
		int sum1 = num1 + num2;
		
		// Assign the result of dividing sum1 by num3 to a new float variable called result.
		float result = (float) sum1 / num3;
		
		System.out.println("Sum of num1 and num2 is " + sum1);
		System.out.println("Result of dividing sum1 by num3 is " + result);
	}
}