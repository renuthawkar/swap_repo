package com.String;

public class Split {

	public static void main(String[] args) {

		String s = "india is my fav contry";

		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);
		}

		System.out.print(rev);

	}

}
