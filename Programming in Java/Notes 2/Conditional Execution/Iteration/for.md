# for
The `for loop` is another ‘convenience’ construct
- its operation can be performed with the while loop

The advantage of the for loop: ‘gathers together’ the control parameters of the loop rather than them being ‘spread out’ as with the while loop.

### Example: for
```java
public class IterationDemo4 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("The value of i is " + i);
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
- This works in the same way as the while loop
- With the for loop, the ‘header’ of the loop contains the index variable (here, i), the condition, and the operation that moves the loop to the next iteration (here, i++).

### Example
> Note that be able to force the for loop to ‘degenerate’ to the while loop by moving the initialisation of the index variable, and the iteration operation, out of the loop header.
```java
public class IterationDemo5 {
	public static void main(String[] args) {
		int i = 0;

		for (; i < 5;) {
			System.out.println("The value of i is " + i);
                        i++;
		}
	}
}
```
