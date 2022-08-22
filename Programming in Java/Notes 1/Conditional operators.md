# Conditional operators
- The conditional operators are binary operators (requiring two operands) that enable the combination of boolean expressions into more complex, compound boolean expressions.
- The two conditional operators are AND and OR but you cannot use those terms in Java
- The conditional operators

|Operator|Java syntax|
|------|---|
|AND|&&|
|OR|\\|\\||

- An expression connected with `AND` is `true if all of the operands are true`.
- An expression connected with `O`R is `true if any of the operands are true`.

### Example
```java
public class ConditionalDemo1 {
	public static void main(String[] args) {
		// b1 is true
		boolean b1 = true && true; 
		
		// b2 is false
		boolean b2 = true && false; 
		
		// b3 is false
		boolean b3 = false && true;
		
		// b4 is false
		boolean b4 = false && false;
		
		// b5 is true
		boolean b5 = true || true;
		
		// b6 is true
		boolean b6 = true || false;
		
		// b7 is true
		boolean b7 = false || true;
		
		// b8 is false
		boolean b8 = false || false;
		
		System.out.println("b1 = " + b1 + "."); 
		System.out.println("b2 = " + b2 + "."); 
		System.out.println("b3 = " + b3 + "."); 
		System.out.println("b4 = " + b4 + "."); 
		System.out.println("b5 = " + b5 + "."); 
		System.out.println("b6 = " + b6 + "."); 
		System.out.println("b7 = " + b7 + ".");
		System.out.println("b8 = " + b8 + ".");
	}
}
```
Output
```
b1 = true.
b2 = false.
b3 = false.
b4 = false.
b5 = true.
b6 = true.
b7 = true.
b8 = false.
```

```java
public class ConditionalDemo2 {
	public static void main(String[] args) {
		int i1 = 3; 
		int i2 = 6; 
		int i3 = 9;
		
		// b1 = false
		boolean b1 = i1 < i2 && i3 < i2;
		
		// b2 = true
		boolean b2 = i1 != 3 || i2 != 5;
		
		// b3 = false
		boolean b3 = i2 == i3 || (b2 && b1);
		
		// b4 is ???
		boolean b4 = i1 > i2 || i2 > i3 || i1 == i3 || i3 >= 8;
				
		// b5 is ???
		boolean b5 = i2 < i3 && (i3 == i2 || i1 <= 3) && b4 != false;
		
		System.out.println("b1 = " + b1 + "."); 
		System.out.println("b2 = " + b2 + "."); 
		System.out.println("b3 = " + b3 + "."); 
		System.out.println("b4 = " + b4 + "."); 
		System.out.println("b5 = " + b5 + ".");
	}
}
```
Question
```
// b4 is ???
boolean b4 = i1 > i2 || i2 > i3 || i1 == i3 || i3 >= 8;
				
// b5 is ???
boolean b5 = i2 < i3 && (i3 == i2 || i1 <= 3) && b4 != false;
```
Answer
```
int i1 = 3; 
int i2 = 6; 
int i3 = 9;

b1 = false
b2 = true
b3 = false

b4 = i1 > i2 || i2 > i3 || i1 == i3 || i3 >= 8
   = 3 > 6 || 6 > 9 || 3 == 9 || 9 >= 8
   = false || false || false || true
   = false || false || true
   = false || true
   = true

b4 = true

b5 = i2 < i3 && (i3 == i2 || i1 <= 3) && b4 != false
   = 6 < 9 && (9 == 6 || 3 <= 3) && true != false
   = true && (false || true) && true
   = true && true && true
   = true && true
   = true

b5 = true
```
Output
```
b1 = false.
b2 = true.
b3 = false.
b4 = true.
b5 = true.
```

## Operator precedence
The conditional operators have the lowest precedence of all of the operators 

|Type|Precedence|
|------|---|
|Postfix unary|expr++ expr--|
|Unary|++expr - -expr +expr -expr !expr|
|Multiplicative|* / %|
|Additive|+ -|
|Relational|< > <= >=|
|Equality|== !=|
|AND|&&|
|OR|\\|\\||
