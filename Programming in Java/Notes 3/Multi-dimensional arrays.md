# Multi-dimensional arrays

Arrays can contain more complex types and can also contain arrays.   
Arrays containing arrays are sometimes called *multi-dimensional arrays*.

- Thinking geometrically, the arrays seen so far are *one-dimensional arrays*.
- It is also common to use *two-dimensional arrays*
- A two-dimensional (2D) array can be thought of as a ’grid’ or ’matrix’ of values, having rows and columns.

## Example
```java
public class ArrayDemo6 {
	public static void main(String[] args) {
		/* declares an array that has two elements. Each element of this array is an array of three elements.

		Visualisation:
		a[0] -> [0][1][2]
	        a[1] -> [0][1][2] */
		
		int[][] a = new int[2][3];
		
                a[0][0] = 2;
                a[1][2] = 7;
                a[2][0] = 4; // error: out of bounds
	}
}
```
- Declaring a two-dimensional array requires two dimensions to be specified.
```java
int[][] a = new int[2][3];
```
- Accessing a two-dimensional array also requires two indices: sometimes called the row and the column.
```java
a[1][2] = 7;
```
- The first index is the row and the second index is the column.

## Example: Arrays of arrays
```java
public class Sudoku {
	public static void main(String[] args) {
		int[][] sudokuBoard = new int[9][9];
		
		// top-left element
	    sudokuBoard[0][0] = 0;
	    
	    // bottom-right element
	   sudokuBoard[8][8] = 0;
	}
}
```
