package Exercise4;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num = Integer.parseInt(reader.nextLine());
		
		if (isEven(num)) {
			System.out.println(num +" is even.");
		} else {
			System.out.println(num +" is odd.");
		}
	}

	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
}