package note2;

public class StringDemo1 {
	public static void main(String[] args) {
		// a declaration. This String cannot be used yet.
		String s1;
		
		// now it can (initialised to the empty string)
		s1 = "";
		
		String s3 = "143";
		String s4 = "%^0))";
		String s5 = "Hacker";
		String s6 = "Dog";
		String s7 = "T.";
		String s8 = "3.142";
		String s9 = "String s8 contains the value of PI to three d.p. as a String";
		
		String s10 = s5 + " " + s7 + " " + s6;
		System.out.println(s10);
		
		String s11 = "4" + "6";
		System.out.println(s11);
	}
}