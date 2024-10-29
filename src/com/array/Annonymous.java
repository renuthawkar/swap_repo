package com.array;

public class Annonymous {

	public static void main(String[] args) {

		Annonymous.isAnonymous(new int[] { 10, 20, 30, 40 });

	}

	static void isAnonymous(int[] no) {

		int total = 0;

	for(int i:no) {

			total = total + i;
		}

		System.out.println(total);

	}

}
