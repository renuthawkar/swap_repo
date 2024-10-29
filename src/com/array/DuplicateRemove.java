package com.array;

public class DuplicateRemove {

	public static void main(String[] args) {

		int[] a = { 2, 3, 4, 5, 6, 7, 8, 2, 3 };

		System.out.println("remove duplicate element");

		for (int i = 0; i < a.length - 1; i++) {

			for (int j = 1; j < a.length; j++) {

				if ((a[i] == a[j]) && (i != j)) {
					System.out.println(a[j]);

				}

			}

		}

	}

}
