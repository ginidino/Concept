package note2;

public class StringDemo9 {
	public static void main(String[] args) {
		String s1 = "David Bowie";
		String s2 = "David Bowie";
		
		String ss1 = s1.substring(0,5);
		String ss2 = s2.substring(0,5);
		
		System.out.println(ss1);
		System.out.println(ss2);
		
		boolean b1 = (ss1.equals(ss2));
		
		System.out.println("b1 is " + b1);
	}
}