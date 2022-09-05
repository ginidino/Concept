package Exercise2;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	    int count = 0;
	    float sum = 0;
	      
	    System.out.println("Enter an integer. Enter a negative number to exit.");
	    int val = in.nextInt();
	      
	    while (val >= 0) {
	        sum += val;
	        count++;
	          
	        if (val > max) {
	           max = val;
	        }
	          
	        if (val < min) {
	           min = val;
	        }
	          
	        System.out.println("Enter an integer. Enter a negative number to exit.");
	        val = in.nextInt();
	    }
	      
	    System.out.println("Max value: " + max);
	    System.out.println("Min value: " + min);
	    System.out.println("Range: " + (max - min));
	    System.out.println("Mean: " + (sum/count));
	    in.close();
	}
}
