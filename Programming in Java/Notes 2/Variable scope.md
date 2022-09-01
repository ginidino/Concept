# Variable scope
In Java, references to a named entity (e.g. a variable) are restricted to those ‘parts of the program’ where the entity is in *scope*.
- For example, a variable name may only be used where it is in scope.
- In the case of a variable, scope can be thought of as the parts of a program where the variable may be referred to and used by name.
- If a variable is not *in scope* at the point at which the program attempts to access it, the compiler will give an error.

### Example
```java
public class ScopeDemo1 {
	public static void main(String[] args) {
		// this variable is in scope throughout the main method
		int i = 0;
		
		// so is this one
		int j = 2;
		
		if (i < j) {
			i += 4; 	// i is in scope here, so this is fine
		} else {
			int k = 5; 	// k is declared inside the else block k *= j;
		}
		
		System.out.println("i = " + i); // fine 
		System.out.println("j = " + j); // fine 
		System.out.println("k = " + k); // ummm
	}
}
```
- Variables `i` and `j` are in scope throughout the `main` method since they are declared at the start of that method.
  - This means they are also available within any block that is declared within the main method.
- The variable `k` is declared inside the else block and is, therefore, only in scope until *the end of that block*.
- The closing brace of the else block closes the block hence ends the scope of variables declared inside the block.
  - the attempt to access k in the output statement will cause a compiler error because the variable k went out of scope at the end of the else block.

Output
```
ScopeDemo1.java:21: error: cannot find symbol
System.out.println("i = " + k); // ummm
^
symbol:  variable k
location: class ScopeDemo1
1 error
```

Blocks can be declared within other blocks. Indeed, this will always be the case in your programs.
- If a block (‘the outer block’) has a block declared inside it (‘the inner block’) then names declared in the outer block are in scope inside the inner block but not *vice versa*.

```java
public class ScopeDemo2 {
	public static void main(String[] args) {
		int i = 0; 
		int j = 2;
		
		if (i < j) {
			int k = 5;
			
			if (i < k) {
				k++; 	// accessible here
				int m = 7;
			} else {
				k--;
			}
			m++;	//oops. Not accessible here
		}
	}
}
```
- Where you declare variables defines their scope. You cannot access a variable that is not in scope.
- One response to this might be to declare all of your variables at the start of the main method.
  -  That would mean that those variables can be accessed anywhere inside the main method.

- This is not considered to be good practice
  - Variables should be declared as close to the point at which they will be used as possible.
  - If they are declared ‘early’ then that could confuse any programmers reading the code.

> Sometimes you will need to declare a variable ‘early’ because you want to use it in a number of places. 
> That is fine but you should at least consider if you could find a better way of achieving that.
