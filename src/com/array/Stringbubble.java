package com.array;

public class Stringbubble {

	public static void main(String[] args) {

		String[] a = { "rohit", "ajinkya", "swap", "kshama", "chiu" };

		String temp;
		for (int i = 0; i < a.length; i++) {
       
			for (int j = 0; j < a.length - 1 - i; j++) {

				if (a[i].compareTo(a[j + 1]) > 0) {

					temp = a[i];
					a[i] = a[j + 1];
					a[j + 1] = temp;
                   
				}
               
			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println( a[i]+" ");
		}

	}

}
