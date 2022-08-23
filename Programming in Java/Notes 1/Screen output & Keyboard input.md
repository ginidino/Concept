# Screen output
- So that programs can communicate with the outside world, it is useful to be able to send messages from programs to output devices
- This is useful for communicating the program’s actions and for debugging and for other purposes.

Consider this line of code:
```java
System.out.println("b1 = " + b1 + ".");
```
- `System` is a built-in Java class that provides some ‘global’ operations and objects that are useful to *any* program.
- One of these fields is an object called `out` that refers to the standard output device 
  > - usually ‘the screen’ or ‘console’ but it could be some other device depending on the system in use

- `println()` is an operation that writes a line of text to the screen
- The characters `ln` appended to the word `print` means that the stream will also send a newline character to the output device 
  > - meaning that the ‘cursor’ will move to the next line after printing
  > - like pressing the ‘return’ key on a computer keyboard

- `println()` can be used with all of the primitive types
  - means it can print them directly
- `println` can also handle mixed types. 

In this line of code
```java
System.out.println("b1 = " + b1 + ".");
```
- "b1 = " is a `String`
- b1 is a `boolean variable`
- "." is a `String`

# Keyboard input
- It is also useful to be able to submit information to a program from the keyboard.
- For this, will use another standard Java class called `Scanner`.
- `Scanner` has methods to read particular types from the keyboard.
- must create a `Scanner` object to read the keyboard.

A Scanner object is created like this
```java
Scanner scanner = new Scanner(System.in);
```
- Before the compiler will accept this, at the top of the file we need an `import` statement so that the compiler knows where to find the definition of `Scanner`
```java
import java.util.Scanner;
```
> Just like System.out is the standard output device, System.in is the standard input device - usually the keyboard.

## Example
```java
import java.util.Scanner;

public class InputDemo {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// read an int from the keyboard
		System.out.println("Please enter an integer.");
		int input = reader.nextInt();
		System.out.println("You entered: " + input);
		
		// read a float from the keyboard
		System.out.println("Please enter a float.");
		float finput = reader.nextFloat();
		System.out.println("You entered: " + finput);

		reader.nextLine(); // removes the newline character from the buffer
		
		// read a String from the keyboard
		System.out.println("Please enter your name.");
		String name = reader.nextLine();
		System.out.println("You entered: " + name);
	}
}
```
Output
```
Please enter an integer.
4
You entered: 4
Please enter a float.
3.45
You entered: 3.45
Please enter your name.
lee
You entered: lee
```
- In the program, there was a seemingly pointless line of code: `It has the comment ‘removes the newline character from the buffer’`
- The technical reason is that the `nextFloat()` method used just above it does not remove the newline character from the buffer.
- That was inserted in the buffer when the user pressed enter.
- This extra use of `readLine()` removes that newline character from the buffer otherwise it causes problems.
