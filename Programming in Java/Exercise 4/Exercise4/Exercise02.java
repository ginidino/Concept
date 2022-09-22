package Exercise4;

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter three integers as a single line of input.");
		String num = reader.nextLine();
		
		String[] newStr = num.split(" ");
		
		int val1 = Integer.parseInt(newStr[0]);
		int val2 = Integer.parseInt(newStr[1]);
		int val3 = Integer.parseInt(newStr[2]);
		
		System.out.println(maxOfThree(val1,val2,val3));
	}

	public static int maxOfThree(int val1, int val2, int val3) {
		if (val1 >= val2 && val1 >= val3) {
			return val1;
		} else if (val2 >= val1 && val2 >= val3) {
			return val2;
		} else if (val3 >= val1 && val3 >= val2) {
			return val3;
		}
		return val1;
	}
}