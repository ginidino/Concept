package Exercise3;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int num = Integer.parseInt(reader.nextLine());
		
		int[][] grid = new int[num][num];
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				grid[i][j] = i * j;
			}
		}
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
	}
}