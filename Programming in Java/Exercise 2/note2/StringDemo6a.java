package note2;

public class StringDemo6a {
	public static void main(String[] args) {
		String s = "David Bowie";
		int spacePos = s.indexOf(' ');
		String fname = s.substring(spacePos + 1);
		System.out.println("Last name is " + fname);
	}
}