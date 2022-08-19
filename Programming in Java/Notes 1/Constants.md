# Constants
A constant: a value that doesn’t change
- Mark a `variable` as constant by adding the modifier `final` before the type.
```java
public class ConstantDemo {
	public static void main(String[] args) {
		final float PI = 3.142f;
        final int MAX_PLAYERS = 32;
        MAX_PLAYERS = 64; // error
        PI = PI * 2;// error
	}
}
```
- Neither of these values can be changed by the program
- the programmer could change their values before trying to run the program
```java
public class ConstantDemo2 {
    public static void main(String[] args) {
       final float PI = 6.142f; // !!! not an error
       final int MAX_PLAYERS = 64;
       MAX_PLAYERS = 32; // error
       PI = PI * 2;// error
    }
}
```

## Compile time and runtime
There are two distinct ‘time periods’ in the programming task.

1. `compile time`
	- This refers to the period whilst you are creating and editing a program.
	- whilst doing this, be able to change anything you want to
2. `runtime`
	- This refers to the period whilst the program is running hence you are not editing and changing it.
	- Whilst a program is running, can’t make changes to the actual code in the program

> ex) Constant values can be changed at compile time but not at runtime.
