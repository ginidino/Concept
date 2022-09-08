# Bubblesort
A nested loop can be used to *sort* an array into a specific order.
- For example, an array of integers can be sorted into an ascending or descending order.
- Consider the program which implements a basic (inefficient) sort called *bubblesort* which sorts an array into ascending order.

This algorithm is called `bubblesort` because in order to sort the array it ‘bubbles’ values ‘up’ the array, 
- i.e. moves them along until they are in the correct position.

## Example
```java
public class Bubblesort {
	public static void main(String[] args) {
		/* the numbers to sort into ascending order */
		int[] values = {2,5,1,9,7,7};
        boolean swapped = true;
        
        while (swapped == true) {
        	swapped = false;
            for (int i = 1; i < values.length; i++) {
            	if (values[i - 1] > values[i]) {
            		int temp = values[i];
                    values[i] = values[i - 1];
                    values[i - 1] = temp;
                    swapped = true;
            	}
            }
        }
        
        for (int i = 0; i < values.length; i++) {
        	System.out.print(values[i] + " ");
        }
        System.out.println();
	}
}
```
