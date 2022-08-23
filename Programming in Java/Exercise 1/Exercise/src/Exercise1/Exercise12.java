package Exercise1;

public class Exercise12 {
	public static void main(String[] args) {
		// Create four floating point variables called val1,val2,val3 and val4.
		// Initialise them to the values 1, 2, 3, 4, respectively (i.e. val1 = 1, val2 = 2, ...).
		float val1 = 1;
		float val2 = 2;
		float val3 = 3;
		float val4 = 4;
		
		// Create a new floating point variable called total and set it to the sum of the four variables created above.
		float total = val1 + val2 + val3 + val4;
		
		// Create a new floating point variable called mean and set it to total divided by 4.
		float mean = total / 4;
		
		System.out.println("Total of val1, val2, val3 and val4 is " + total);
		System.out.println("Mean is " + mean);
	}
}