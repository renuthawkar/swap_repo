package com.PracticeTest;

public class Addition {
	
	int addtionNumber(int a, int b)
	{
		int c=0;
		c= a+b;
		System.out.println("Inside Method --> value of c:"+c);
		return c;
		
	}
	
	
	public static void main(String[] args) {
	Addition num = new Addition();
	int n1=10;
	int n2=20;
	num.addtionNumber(n1,n2);
	}

}
