package com.PracticeTest;

public class MobieBrand {
	
	Mobile MobileDetailes(Mobile n) {
			System.out.println("Brand name :"+n.getMobileBrand());
		
	//	System.out.println("Brand Id:"+m.getMobileID());
		//System.out.println("Mobile name :"+m.getMobileName());
		//System.out.println("Brand prise :"+m.getPrise());
		return n;
		
		
	}

	
	public static void main(String[] args) {
		//Mobile object
		Mobile m = new Mobile();
		m.setMobileID(1);
		m.setMobileName("Iphone 14");
		m.setMobileBrand("Apple");
		m.setPrise(1400000);
		
		//class object
	MobieBrand brand = new MobieBrand();

	
	brand.MobileDetailes(m);
	
	
	}

}
