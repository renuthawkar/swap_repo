package kanade_sir;

public class Addition {

	public static void main(String[] args) {
		Addition ad = new Addition();
		int n1 = 10;
		int n2 = 20;
		ad.additionOfNum(n1, n2);

	}

static	int additionOfNum(int a, int b) {
		int c = 0;
		c = a + b;
		System.out.println("Addition of 2 num is :" + c);

		return c;

	}

}