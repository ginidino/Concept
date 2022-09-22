package Exercise4;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Input an integer to see its cube: ");
		int num = Integer.parseInt(reader.nextLine());
		
		int result = cube(num);
		System.out.println("Cube of " + num + ": " + result);
	}
	
	public static int cube(int val) {
		return val * val* val;
	}
}