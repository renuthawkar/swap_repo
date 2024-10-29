package com.array;

class forEachArray {

	public static void main(String[] args) {

		is_foreach_array();

	}

	public static int is_foreach_array() {

		int[] a = { 10, 20, 30, 40, 50 };
		int total = 0;
		for (int i : a) {

			total = total + i;
		}
			System.out.println(" " + total);
		

		return 0;

	}

}
