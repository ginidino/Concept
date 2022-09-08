# Array length
Java built-in arrays have a property called `length` that allows you to find the number of elements in the array.

## Example
```java
import java.util.Scanner;

public class ArrayDemo5 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("How many ages do you wish to enter?");
		int numAges = Integer.parseInt(reader.nextLine());
		
		int ages[] = new int[numAges];
		
		System.out.println("Enter the ages.");
		int index = 0;

		do {
			ages[index] = Integer.parseInt(reader.nextLine());
		} while (++index < numAges);
		
		System.out.println("You entered the following ages:"); 
		double sum = 0;
		
		for (int i = 0; i < numAges; i++) { 
			System.out.print(ages[i] + " "); 
			sum += ages[i];
		}
		
		System.out.println("\nAverage age is: " + sum / ages.length + ".");
	}
}
```
Output
```
How many ages do you wish to enter?
4
Enter the ages.
15
23
63
34
You entered the following ages:
15 23 63 34 
Average age is: 33.75.
```
