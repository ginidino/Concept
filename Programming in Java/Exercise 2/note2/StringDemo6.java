package note2;

public class StringDemo6 {
	public static void main(String[] args) {
		String s = "David Bowie";
		int spacePos = s.indexOf(' ');
		String fname = s.substring(0, spacePos);
		System.out.println("First name is " + fname);
	}
}