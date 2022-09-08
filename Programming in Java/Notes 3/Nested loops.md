# Nested loops
It is convenient to access multi-dimensional arrays using loops (as with one-dimensional arrays) but it is more natural to access them using `nested loops`.

A `nested loop` is a loop that has one or more other loops declared inside it.
- If a nested loop has two loops (the outer loop and the inner loop) the inner loop does a complete set of iterations for each single iteration of the outer loop.

## Example: Sudoku
```java
public class Sudoku2 {
	public static void main(String[] args) {
		final int N_ELEMENTS = 9;
		
        int[][] sudokuBoard = new
        int[N_ELEMENTS][N_ELEMENTS];
        
        /* a nested loop to initialise the sudoku board to all zero values */
        
        // accesses each row of the board
        for (int i = 0; i < N_ELEMENTS; i++) {
        	// accesses each column
            for (int j = 0; j < N_ELEMENTS; j++) {
            	sudokuBoard[i][j] = 0;
            }
        }
	  }
}
```

## Example2: Array of arrays
```java
public class ArrayDemo7 {
	public static void main(String[] args) {
		final int ARRAY_DIM = 4;
        int[][] values = new int[ARRAY_DIM][ARRAY_DIM];
        
        for (int row= 0; row < ARRAY_DIM; row++) {
            for (int column = 0; column < ARRAY_DIM; column++) {
                values[row][column] = row + column;
            }
        }
        System.out.println("Index[1][1] = "+ values[1][1]);
        System.out.println("Index[2][3] = "+ values[2][3]);
        System.out.println("Index[0][3] = "+ values[0][3]);
	}
}
```
Output
```
Index[1][1] = 2
Index[2][3] = 5
Index[0][3] = 3
```
