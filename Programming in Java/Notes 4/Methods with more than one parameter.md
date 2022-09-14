# Methods with more than one parameter
Methods can only have one return type.

However, methods can have multiple parameters. A large number of parameters is not advisable though since the method will become hard to understand and to use.

## Example
Multiple parameters are simply separated by commas as shown.
```java
public static void main(String[] args) {
		method2(7);
		method1();
		method4("Mick Jagger", 74, 3.7); method2(99);
		method4("DanTDM",3, 65.7454);
	}

	public static void method1() {
		System.out.println("Inside method1");

	}

	public static void method2(int val) {
		System.out.println("Inside method2");
	}

	public static void method4(String name, int val, double f) {
		System.out.println("Inside method4");
	}
	
	public static void method3(int val1, int val2) {
		System.out.println("Inside method3");
	}
}
```
- This program has five methods, including main
- The program starts on line 3 with a call to method2.
  - That method takes one parameter (an int).
- The next line of the program calls method1 which takes no parameters.
- In line 5, method4 is called which takes 3 parameters.
  - They are listed between the brackets, separated by commas.
- The next two lines of the program call method2 and method4 respectively.

This program illustrates some other important facts:
- The order in which the methods are defined in the class is irrelevant to the execution of the program.
- Methods can also be called in any order (that makes sense in the program).
- Methods may be called any number of times - from zero to many (in the example, method3 is not called at all whilst method2 and method4 are called twice each).
- > Note: 
  > in the example program, the methods do not use their parameters. This is allowable but extremely questionable. If a method doesn‘t need parameters it shouldn’t have them. This program was given for illustrative purposes only. It is useless.

- Output
  ```
  Inside method2
  Inside method1
  Inside method4
  Inside method2
  Inside method4
  ```
