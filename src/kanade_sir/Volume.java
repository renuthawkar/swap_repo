package kanade_sir;

public class Volume {

	public static void main(String[] args) {
        Volume v=new Volume();
        
		int a = 20;
		int b=30;
		int c=10;
		v.volume(a, b, c);
		

		
	}

	int volume(int l, int b, int h) {

		int v = l * b * h;

		System.out.println("total is" + v);

		return v;

	}

}
