package kanade_sir;

public class Subject_Marks {

	public static void main(String[] args) {

		Subject_Marks s = new Subject_Marks();
		int n1 = 46;
		int n2 = 76;
		int n3 = 67;
		int n4 = 88;

		s.Average_marks(n1, n2, n3, n4);

	}

	int Average_marks(int a, int b, int c, int d) {

		int total = a + b + c + d;

		System.out.println("total marks" + total);
		
		int avg = total / 4;

		System.out.println("Average_Mark :" + avg);

		return total;
	}

}
