package kanade_sir;

public class Multiplication {

	public static void main(String[] args) {

		Multiplication m = new Multiplication();

		int n1 = 10;
		int n2 = 30;
		int n3 = 80;

		m.multipling_num(n1, n2, n3);

	}

	int multipling_num(int a, int b, int c) {

		int d = 0;
		d = a * b * c;

		System.out.println("mutiplication of tow no. :" + d);

		return d;

	}

}
