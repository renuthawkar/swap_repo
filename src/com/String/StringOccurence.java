package com.String;

public class StringOccurence {
	public static void main(String[] args) {

		String s = "i am renu thawkar im very clever";

		String[] res = s.split("");

		for (int i = 0; i < res.length; i++) {
			int count = 1;
			for (int j = i + 1; j < res.length; j++) {

				if (res[i].equals(res[j]))
					count++;

			}

			for (int k = i; k > 0; k--) {

				if (res[k].equals(res[i]))

				{
					count = 0;

				}
				if (count >= 1) {

				
				}
			}	System.out.println(res[i] + "  " + count);

		}

	}

}
