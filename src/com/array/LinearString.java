package com.array;

public class LinearString {

	public static void main(String[] args) {

		String[] arr = { "renu", "pratiksha", "anuj", "ojasvita", "ziya" };

		String item = "pratiksha";
	int temp = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i].equals(item)) {

				System.out.println("element present at" + i);
				temp = temp = 0;

			}

		}

		if (temp == 0) {

			System.out.println("is not prenset");

		}
	}
}