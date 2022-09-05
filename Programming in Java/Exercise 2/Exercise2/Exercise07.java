package Exercise2;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Prompt the user to enter an amount of currency in GBP (£).
		// The input amount should be in floating point format, with two decimal places representing the pennies.
		System.out.print("Enter the GBP you wish to convert: ");
		float gbp = reader.nextFloat();
		
		System.out.println("Enter the currency you wish to convert to: ");
	    System.out.println("Enter d to convert to dollars.");
	    System.out.println("Enter e to convert to euros.");
	    System.out.println("Enter i to convert to rupiah.");
	    
	    reader.nextLine();
	    
	    String currency = reader.nextLine();
	    
	    if (currency.equals("d")) {
	    	float dollar = (float) (gbp * 1.32);
	    	System.out.println("In dollars this is " + dollar);
	    } else if (currency.equals("e")) {
	    	float euro = (float) (gbp * 1.16);
	    	System.out.println("In euros this is " + euro);
	    } else if (currency.equals("i")) {
	    	float rupiah = (float) (gbp * 18687.88);
	    	System.out.println("In rupiah this is " + rupiah);
	    }
	}
}