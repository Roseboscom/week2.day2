package week2.assignments;

public class ReverseString {

	public static void main(String[] args) {

		String test = "feeling good";
		String rev = "";
		char[] ch = test.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + ch[i];
		}
		System.out.println("The reversed string is " + rev);

	}

}
