# Method overloading

## Example
```java
public class Overloading {
	public static void main(String[] args) {
		f();
		f(5);
		f("Barry");
		f(1,3.55);
		f(87.5);
		f("Cedric");
		f(66);
	}

	public static void f() {
		
	}

	public static void f(double d) {
		
	}

	public static void f(int i, double d) {
		
	}

	public static void f(String string) {
		
	}
}
```
- In this program, all of the methods (except main) have the same name.
  - This is perfectly legal.
- All of these methods called `f` have different parameter lists.
- This is perfectly legal and is mandatory if they are to have the same name.
- So long as the parameter lists are different, the methods can have the same name.
- The parameters can be the same types provided they are listed in a **different order**.
- If there are multiple methods with the same name, that is called method *`overloading`*.

## Example2
```java
public class NotOverloading {
	public static void main(String[] args) {
		
	}
	
	public static void g(int val) {
		// on its own this method would be fine.
	}
	
	public static void g(int num) {
		 // this is not allowed. Cannot simply change the name of the paramter.
	    // It is the type that matters.
	}
	
	public static int g(int val) {
		// this is also not allowed. Cannot simply change the return type.
	}
}
```
- The comments in the listing state the problems.
- Cannot simply change the name of the parameters to overload a method.
- Cannot overload a method simply by changing its return type.

This leaves a question: why would you overload a method?   
The answer
- this will become more evident over time but, in short, you might do this in situations where you have an operation that you want to perform but you may have different pieces of information available when you need to perform that operation.
- Or, the same operation might work on different lists of values.
  - For example, you might provide a method to add two integers and also a version to add three integers.
  - One method could do the job but it is more convenient to create two different methods to do this.

## Example3
```java
public class OverloadingExample {
	public static void main(String[] args) {
		int num1 = add(2, 6);
	    int num2 = add(2, 7, 5);
	    int num3 = add(2, 6, 0);

	}

	public static int add(int val1, int val2) {
		return val1 + val2;
	}

	public static int add(int val1, int val2, int val3) {
		return val1 + val2 + val3;
	}
}
```
- The first version of `add` (line 8) adds two integers, whilst the second version (line 12) adds three.
- The second version of `add` could be used to perform the addition of two integers only by simply passing zero as the third parameter.
- However, this is slightly inconvenient and we can avoid having to do that by simply providing the version that takes two parameters.
