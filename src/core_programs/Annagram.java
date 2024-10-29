package core_programs;

import java.util.Arrays;

class Annagram {

	public static void main(String[] args) {

		String x = "slient";
		String y = "listen";

		char a[] = x.toCharArray();
		char b[] = x.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		Boolean result = Arrays.equals(a, b);

		if (result == true) {

			System.out.println("String are anagram");

		} else {
			System.out.println("String are not anagram");
		}

	}
}