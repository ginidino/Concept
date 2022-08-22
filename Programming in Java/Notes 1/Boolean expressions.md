# Boolean expressions
- `Boolean expressions` evaluate to true or false
- They are used extensively in control, selection and iteration

## Relational and equality operators
- These are used in boolean expressions
- The relational and equality operators

|Operator|Function|
|------|---|
|<|Less than|
|<=|Less than or equal to|
|>|Greater than|
|>=|Greater than or equal to|
|==|Equals|
|!=|Not equal to|

> * Note that the equality operator is ==. This is somewhat unfortunate and leads to confusion and bugs 
### Example
```java
public class RelationalDemo1 {
	public static void main(String[] args) {
		int i1 = 3; 
		int i2 = 5; 
		int i3 = -2;
		
		// b1 = true
		boolean b1 = i1 < i2;
		
		// b2 = false
		boolean b2 = i3 < i3;
		
		// b3 = true 
		boolean b3 = i3 <= i3;
		
		// b4 = true
		boolean b4 = i1 != i3;

		// b5 = ???
		boolean b5 = i2 == i3 == b4;
		
		// b6 = ??? 
		boolean b6 = true == false;
		
		// b7 = ??? 
		boolean b7 = !(b3 == (i3 == i2) == (i1 != 7));
		
		System.out.println("b1 = " + b1 + "."); 
		System.out.println("b2 = " + b2 + "."); 
		System.out.println("b3 = " + b3 + "."); 
		System.out.println("b4 = " + b4 + "."); 
		System.out.println("b5 = " + b5 + "."); 
		System.out.println("b6 = " + b6 + "."); 
		System.out.println("b7 = " + b7 + ".");
	}
}
```
Question:
```java
// b5 = ???
boolean b5 = i2 == i3 == b4;
		
// b6 = ??? 
boolean b6 = true == false;
		
// b7 = ??? 
boolean b7 = !(b3 == (i3 == i2) == (i1 != 7));
```
Answer:
```
int i1 = 3; 
int i2 = 5; 
int i3 = -2;

b1 = true
b2 = false
b3 = true 
b4 = true

b5 = i2 == i3 == b4
   = 5 == -3 == true
   = false == true
   = false

b5 = false

b6 = true == false
   = false

b6 = false

b7 = !(b3 == (i3 == i2) == (i1 != 7))
   = !(true == (5 == -2) == (3 != 7))
   = !(true == false == true)
   = !(false == true)
   = !false
   = true

b7 = true
```
Output
```
b1 = true.
b2 = false.
b3 = true.
b4 = true.
b5 = false.
b6 = false.
b7 = true.
```

### Float Comparison
- not always get the mathematically correct result when using arithmetical operators with floating point values due to the finite nature of the IEEE754 representation.
- This can also lead to unexpected results when using floating point results in boolean expressions
- Programmers must always be mindful of the limitations of the IEEE754 representation of floating point values.

```java
public class FloatComparisonDemo1 {
	public static void main(String[] args) {
		float f = 0.333333f;
		
		f = f / 10;
		
		boolean b = f == 0.0333333f;
		
		System.out.println("b = " + b);
		System.out.println("f = " + f);
	}
}
```
expect the output to show that b is `true` but it output is `false`
```
b = false
f = 0.033333298
```

## Operator precedence
The relational and equality operators have the lowest precedence of the operators

|Type|Precedence|
|------|---|
|Postfix unary|expr++ expr--|
|Unary|++expr - -expr +expr -expr !expr|
|Multiplicative|* / %|
|Additive|+ -|
|Relational|< > <= >=|
|Equality|== !=|
