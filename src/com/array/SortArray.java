package com.array;

public class SortArray {

	public static void main(String[] args) {

		int[] a = { 38, 52, 9, 18, 6, 62, 13 };

		int min = a[0], temp = 0;

		for (int i = 0; i < a.length; i++) {

			min = i;
			for (int j = i + 1; j < a.length; j++) {

				if (a[j] < a[min]) {

					min = j;
				}

			}

			temp = a[i];
			a[i] = a[min];
			a[min] = temp;

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(" ," + a[i]);
			
			if (a[i] < a[min]) {
			
			min = i;
			
			System.out.println(+a[i]);
			}
			
		}
		}
	}


