package com.array;

class bubbleSort {
	public static void main(String[] args) {

		int temp;
		int[] a = { 12, 45, 67, 89, 4, 66 };

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - 1 - i; j++) {

				if (a[j] > a[j + 1]) {

					temp = a[i];
					a[i] = a[j + 1];
					a[j + 1] = temp;
//					flag = 1;

				}
//				if (flag == 0) {
//					break;
//				}
			}

		}
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i] + "");
		}

	}
}