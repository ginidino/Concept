It is often the case that need to store multiple data items of the same type.   
It is also often inconvenient to declare multiple separate variables for the purpose.

## Example 
```java
import java.util.Scanner;

public class ArrayDemo1 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int age1 = 0;
		int age2 = 0;
		int age3 = 0;
		int age4 = 0;
		
		int index = 0;
		
		System.out.println("Enter four ages.");
		age1 = Integer.parseInt(reader.nextLine());
		age2 = Integer.parseInt(reader.nextLine());
		age3 = Integer.parseInt(reader.nextLine());
		age4 = Integer.parseInt(reader.nextLine());
		
		System.out.println("Average age is: " + (age1+age2+age3+age4) / 4.0f + ".");
	}
}
```
Output
```
Enter four ages.
25
12
27
41
Average age is: 26.25.
```
- This program is bound very tightly to there being always four ages entered.
- Depending for application, it may always be the case that exactly four ages will need to be entered, never more, never less.
- For the program to work with a different number of ages than four, it need to be amended.
- This is exactly the kind of situation that requires an *array*.

# Array
`Array` allows us to easily store multiple items of the same type.

The items in an array are often called its elements.

One of the key limitations of built-in arrays is that they are static.
- The number of elements arrays can contain is fixed when they are created and cannot be altered afterwards.

Variables in an array do not have an explicit name.
- Or, rather, their names are simply the name of the array in conjunction with an index.
- As usual, some code will make this more obvious.

* Always keep in mind that the first element of an array has the index zero.   
* The final element of the array is element n − 1 where n is the number of elements in the array.

## Example1
There are a number of ways in which an array can be created.
```java
public class ArrayDemo1a {
	public static void main(String[] args) {
		// create an array
		int[] values = new int[6];
		
		// put some values into the array
		values[0] = 3; 
		values[2] = 7; 
		values[5] = 12;
		
		// print out the array values
		for (int i = 0; i < 6; i++) { 
			System.out.print(values[i] + " ");
		}
		System.out.println(); // prints a blank line
		
		// calculate the sum of the values in the array
		float sum = 0.0f;
		
		for (int i = 0; i < 6; i++) {
			sum = sum + values[i];
		}
		
		// calculate the average
		float avg = sum / 6;
		
		System.out.println("The average value is " + avg);
	}
}
```
Output
```
3 0 7 0 0 12 
The average value is 3.6666667
```

```java
int[] values = new int[6];
```
- The line of code shows an array being created.
- The array will contain ints, it is called values and it is of size 6.
- This means that it can contain a minimum and a maximum of 6 integers.
- The names of the elements are values[0],values[1],values[2],values[3],values[4], values[5].

> Note the use of the operator new. This simply causes the array to be created.

```java
values[0] = 3; 
values[2] = 7; 
values[5] = 12;
```
- These lines of code set the values of some of the array elements.

```java
for (int i = 0; i < 6; i++) { 
  System.out.print(values[i] + " ");
}
```
- This loop shows how the elements of an array can be accessed.
- Array elements can be accessed with a constant or with a variable.
  - i.e. values[2] accesses the third element of the array.
- However, in this loop, the array elements are accessed with an index variable.
- This loop iterates through the entire array and accesses each element *in turn*. 
- This is ensured by the operation `i++`.

## Example2
The program demonstrates a better way to declare an array.
```java
public class ArrayDemo2 {
	public static void main(String[] args) {
		final int NUM_VALUES = 5;
		
		int[] values = new int[NUM_VALUES];
		
		for (int index = 0; index < NUM_VALUES; index++) {
	           values[index] = index * 2;
		}
		
		for (int index = 0; index < NUM_VALUES; index++) {
	          System.out.print(values[index] + " ");
		}
	}
}
```
Output
```
0 2 4 6 8 
```
- This program declares a constant called **NUM VALUES** and sets its value to 5.
- A constant is declared with the word final.
- The value of this constant cannot be changed *by the program*.
- `NUM VALUES++` is an example of an illegal operation that would be caught by the compiler.

## Example3 & Example4
It is also possible to set the size of an array using a variable rather than a constant.

- In this program, the user is asked for a number and then an array is created with that size.
- Whatever the user enters is set as the value of numAges which is then used to create the array.
- There is no way of knowing when writing this program, what value the user(s) will enter.

### Example3
```java
import java.util.Scanner;

public class ArrayDemo3 {
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
		float sum = 0;
		
		for (int i = 0; i < numAges; i++) { 
			System.out.print(ages[i] + " "); 
			sum = sum + ages[i];
		}
		
		System.out.println("\nAverage age is: " + sum / numAges + ".");
	}
}
```
Output
```
How many ages do you wish to enter?
4
Enter the ages.
25
31
53
23
You entered the following ages:
25 31 53 23 
Average age is: 33.0.
```

### Example4
```java
public class ArrayDemo4 {
	public static void main(String[] args) {
		int[] a1 = new int [20];
		
		final int NUM_VALUES = 5;
        int[] a2 = new int[NUM_VALUES];
        
        int num = 4;
        int[] a3 = new int [num];

        // note that the size of the array does not
        // need to be explicitly stated if an
        // initialiser list is used
        int[] a4 = {1, 4, 6, 4, 2, 8, 9};
        int a5[] = {3, 4, 8}; 	// old c-style declaration. Not advised.
	}
}
```
```java
int a1[] = new int [20];
```
> Note: the square brackets can be positioned after the variable name.   
> don’t use this C-style declaration. 
