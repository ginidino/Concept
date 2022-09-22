package Exercise4;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Input an expression: ");
		String expression = reader.nextLine();
		
		String[] newStr = expression.split(" ");
		
		int num1 = Integer.parseInt(newStr[0]);
		int num2 = Integer.parseInt(newStr[2]);
		
		char op = newStr[1].charAt(0);
		
		float result = eval(num1, num2, op);
		
		if (result == Float.MIN_VALUE) {
			System.out.println("Illegal operation.");
		} else {
			System.out.println(result);
		}
	}

	public static float eval(int operand1, int operand2, char operator) {
		if (operand2 == 0 && operator == '/') {
			return Float.MIN_VALUE;
		} 
		
		float result = Float.MIN_VALUE;
		
		if (operator == '+') {
			result = operand1 + operand2;
		} else if (operator == '-') {
			result = operand1 - operand2;
		} else if (operator == '*') {
			result = operand1 * operand2;
		} else if (operator == '/') {
			result = operand1 / (float)operand2;
		}
		return result;
	}
}