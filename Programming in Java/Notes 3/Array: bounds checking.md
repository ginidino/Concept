# Array: bounds checking
Java automatically checks at runtime if an array access would be out of bounds.
- This means an attempt to use an index that is less than zero or greater than the array’s length - 1.
- If such an access is attempted, an exception is thrown by the runtime system.
- i.e. if you create an array of length 5, then you cannot access any element with an index that is less than zero or greater than 4 (without causing an error).
- For an array called values of length 5, the following statement would cause an exception:
```java
int num1 = values[5];
```
