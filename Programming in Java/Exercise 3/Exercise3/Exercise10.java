package Exercise3;

import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int[][] arr = {{0, 1, 4, 5}, {3, 7, 9, 7}, {1, 8, 2, 1}};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.print("Enter an index: ");
		String numArr = reader.nextLine();
		
		int row = Character.getNumericValue(numArr.charAt(0));
		int column = Character.getNumericValue(numArr.charAt(1));
		
		System.out.println(arr[row][column]);
		
		arr[row][column] = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}