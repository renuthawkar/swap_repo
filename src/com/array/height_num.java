package com.array;

public class height_num {
	public static void main(String[] args) {

		int[] a = { 4, 3, 5, 2, 1, 6 };

		int max = 0;
		for (int i = 1; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max - 1);
	}

}
