The `main` method is a special method that defines the entry point for the program. The Java system is expecting a `main` method if you try and run a class *as a program*. However, java programs can contain many classes and many method. 

# Structure
Be able to improve structure of program with methods. 
- Instead of simply dumping all of our code in the main method (which is an option but leads to hard-to-understand, brittle code), we ‘bundle’ bits of the code into methods to make the code easier to understand and less likely to break.

## Example1
```java
import java.util.Scanner;

public class MethodDemo1 {
	public static final int MAX_VALUE = 10;
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int[] value = new int[MAX_VALUE];
		
		System.out.println("Enter up to " + (MAX_VALUE - 1) + " values.");
		
		for (int i = 0; i < MAX_VALUE - 1; i++) {
			value[i] = Integer.parseInt(reader.nextLine());
		}
	}
}
```
Output
```
Enter up to 9 values.
1
2
3
4
5
6
7
8
9
```
- This main method starts by getting some values off the user via the keyboard.
- It performs a single task, in the context of the program:
  - it gets some values off the user.
- We need this code to exist but do we need it cluttering up the main method. -> The answer is ‘no’.
- Be able to put the code into a method instead.

## Example2
```java
import java.util.Scanner;

public class MethodDemo2 {
	public static final int MAX_VALUE = 10;
	
	public static void main(String[] args) {
		int[] value = getUserInput();
	}

	public static int[] getUserInput() {
		int[] value = new int[MAX_VALUE];
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter up to " + MAX_VALUE + " values.");
		
		for (int i = 0; i < MAX_VALUE; i++) {
			value[i] = Integer.parseInt(reader.nextLine());
		}
		
		return value;
	}
}
```
Output
```
Enter up to 10 values.
1
2
3
4
5
6
7
8
9
0
```
- The signature of the new method is as follows:
```java
public static int[] getUserInput() {
```
- There are some important components of this signature to get used to since they apply to **all** methods.

## Some terminology
- When write a method, i.e. put some code into the method, that is called the *definition* of the method. 
- The code in the method is somethimes called the *body* of the method
- When we want to use a method, i.e. get it to do what it was designed to do, we call the method.

## Method name
```java
public static int[] getUserInput() {
```
- The name of this new method is getUserInput.
- The name of the main method is main.
- Methods can have any valid name
  - and should also have an acceptable name - more on that in the future
- When want to call a method we must use its name. 
  - We cannot spell or capitalise the name differently when we call it.
  - We must use it exactly as shown in the signature.

## Parameters
```java
public static int[] getUserInput() {
```
- The parameters of a method are the information that you must pass to it in order for it to do its job.
- The parameters are to be found between the round brackets () after the name.
- In the case of the `getUserInput` method, there are no parameters listed between the brackets
- The brackets are empty.
- If there are no parameters then we do not need to (and in fact, can’t) pass information to the method.
- There can be any number of parameters, but it is not advisable to have too many.
  - This is because too many parameters will make a method hard to use.
- When we call a method we must use its parameters exactly as specified in the signature.
  - We cannot miss some out or add extra ones, change the parameter type, for example.

## Return type
```java
public static int[] getUserInput() {
```
- The return type of a method is the type of value that it will pass back to the method that called it
- Some methods will perform some computation and then return a result.
- The `getUserInput` method returns an `integer array`.
  - This means that whichever code called that method has the option to use that integer array in its own functionality.
  - This is optional because return values can be ignored, although generally that is not what you want to do.
- A method might return nothing at all. 
- In this case its return type is specified as `void`.

## Calling getUserInput
The getUserInput method is called as follows:
```java
int[] values = getUserInput();
```
- The method is called by using its name and its parameter list. 
  - In this case, there are no parameters so the brackets are empty.
- Since the getUserInput method returns an integer array, we can use that return value to initialise our own array.
- That is achieved by assigning to the variable `values` the result of the `getUserInput` method.
- `getUserInput` creates its own integer array, fills it with values, and then passes it back to the calling code.
- The returned array is then copied into the array defined in the calling code

# Structure
Since this program(Example2) is not very useful at the moment
- it simply gets the user input and then does nothing else
- add another method that simply prints the input values

This new method has the following signature:
```java
public static void printValues(int[] values) {
```
- The name of this method is `printValues()`.
- It expects to receive a single parameter: 
  - an array of int
- The return type of this method is `void`.
- `void` means that the method does not return a value at all.

* There are some methods from which we naturally want to return a value.
* There are others, however, where we want the method to do something but we do not need it to return a value.

## Example3
```java
import java.util.Scanner;

public class MethodDemo3 {
	public static final int MAX_VALUE = 4;
	
	public static void main(String[] args) {
		
		int[] values = getUserInput(); 
		printValues(values);
	}

	public static int[] getUserInput() {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter up to " + MAX_VALUE + " values.");
		
		int[] arr = new int[MAX_VALUE];
		
		for (int i = 0; i < MAX_VALUE; i++) {
			arr[i] = Integer.parseInt(reader.nextLine());
		}
		return arr;
	}

	public static void printValues(int[] values) {
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		}
	}
}
```
Output
```
Enter up to 4 values.
1
2
3
4
1 2 3 4 
```
In order to understand how this program all fits together -> do a walk through of the program to see exactly that
- This program has three methods:
  - `main()` (line 6).
  - `getUserInput()` (line 11). 
  - `printValues()` (line 24).
- Java system will look for the main method to start the program.
- We **never** call the main method. Java does that for us. 

In this case, the first line of the program that does anything at all is line 6:
```java
int[] values = getUserInput();
```
* At this line we find a method call.
* The main method calls the `getUserInput` method.
* What that actually means is that the program transfers *execution* to the `getUserInput` method, so the next line that is executed in this program will be line 11, which is the start of the `getUserInput()` method.
* To recap, when we call a method we must observe the following rules:
```
☐ We must use its name correctly.
☐ We must pass the correct types as parameters, where applicable, and we must pass the right number of parameters.
☐ If we want to use the return value (not compulsory), we must respect the type of the return value.
```

Therefore, the next line of the program that will be executed is line 15, within the getUserInput() method:
```java
int[] arr = new int[MAX_VALUE];
```
* This method will proceed line by line (iterating until it has received all input values) until it reaches line 21.
* At this point it *returns* the array it created at line 16, which now contains the input values, to the method that called `getUserInput()`.
* As we know, that was the main method.
* The word `return` causes the `getUserInput()` method to end and execution to go back to the `main` method.

Back at line 7 in the main method.
```java
int[] values = getUserInput();
```
* What happens now is that array that was returned by getUserInput() is assigned to the variable values.
* Note that the name of the array variable in `getUserInput` was `arr`.
* The variable in `main` is called `values`.
* This makes no difference.
* They do not have to have the same name.
* It just cares that it is an array of `int`.

The program now continues to line 8 of the main method. At that line we find another method call:
```java
printValues(values);
```
* This method call looks a bit different.
  1. This is because, firstly, the return type of `printValues` is specified as `void`.
      * This means that the method *does not return anything*.
      * Hence, there is no value being returned by the method so we cannot assign the return value to a variable (as we did with getUserInput).
  2. Secondly, another difference is that we pass a parameter to `printValues`. 
      * The printValues method expects to receive an array of int as a parameter.
      * In this example, we pass it the array that was created in the previous line of code in the main method.
      ```java
      int[] values = getUserInput();
      printValues(values);
      ```
      * We are not allowed to call printValues with no parameter, or a different type of parameter, or a different number of parameters.
