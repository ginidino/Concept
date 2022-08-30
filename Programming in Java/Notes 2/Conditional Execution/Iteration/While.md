# While
`while loop` requires a boolean expression as a condition (exactly as with the `if` constructs).
- If the condition never becomes false, the loop will be ‘infinite’ and never stop looping.
- If the condition is false before the first attempt to iterate, the loop will not be executed.

### Example: while
```java
public class IterationDemo1 {
	public static void main(String[] args) {
		int i = 0;
		
		while (i < 5) {
			System.out.println("The value of i is " + i);
			i++;
		}
	}
}
```
Output
```
The value of i is 0
The value of i is 1
The value of i is 2
The value of i is 3
The value of i is 4
```

### Example: while
```java
import java.util.Scanner;

public class IterationDemo2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter an integer value.");
		int numIterations = reader.nextInt();
		
		int i = 0;
		
		while (i < numIterations) {
			System.out.println("The value of i is " + i);
            i++;
		}
	}
}
```
Output
```
Please enter an integer value.
5
The value of i is 0
The value of i is 1
The value of i is 2
The value of i is 3
The value of i is 4
```

## do while
- The `do while` loop is a more rarely used loop.
  - Its function can be performed with a regular `while` loop.
- It is a more natural construct, however, when the loop must iterate *at least once*.

### Example: do while
The program demonstrates how do while can be used to get input at least once.
```java
import java.util.Scanner;

public class IterationDemo3 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int numIterations = 0;
		do {
			System.out.println("Please enter a number. -1 to quit.");
			numIterations = reader.nextInt();
			
			int i = 0;
			
			while (i < numIterations) {
				System.out.println("The value of i is " + i);
				i++;
			}
		} while (numIterations >= 0);
	}
}
```
Output
```
Please enter a number. -1 to quit.
5
The value of i is 0
The value of i is 1
The value of i is 2
The value of i is 3
The value of i is 4
Please enter a number. -1 to quit.
15
The value of i is 0
The value of i is 1
The value of i is 2
The value of i is 3
The value of i is 4
The value of i is 5
The value of i is 6
The value of i is 7
The value of i is 8
The value of i is 9
The value of i is 10
The value of i is 11
The value of i is 12
The value of i is 13
The value of i is 14
Please enter a number. -1 to quit.
-1
```
