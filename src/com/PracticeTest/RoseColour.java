package com.PracticeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RoseColour {
	String RoseColour;
	String red="Red";

	List<Rose> findRoseColour(List r) {

		for (int i = 0; i < r.size(); i++) {
			Rose r_temp = (Rose) r.get(i);
			
			//System.out.println("Index : "+i);
			
			if (r_temp.getRoseColour().equals( red)) {
				
				System.out.println("Index: "+i+"		Red			and id is : "+r_temp.getRoseId());
				System.out.println("Changes done....");
			}
			else {
				
				System.out.println("Index: "+i+"		Not-Red		and id is : "+r_temp.getRoseId());
			}
		}
		return r;
	}

	public static void main(String[] args) {

		Rose r = new Rose();
		r.setRoseId(1);
		r.setRoseColour("Red");
		
		Rose r1 = new Rose();
		r1.setRoseId(2);
		r1.setRoseColour("Pink");
		
		Rose r2 = new Rose();
		r2.setRoseId(3);
		r2.setRoseColour("Red");
		
		Rose r3 = new Rose();
		r3.setRoseId(4);
		r3.setRoseColour("Pink");
		
		Rose r4= new Rose();
		r4.setRoseId(5);
		r4.setRoseColour("Red");
		

		
		List<Object> list = new ArrayList<>();
		list.add(r);
		list.add(r1);
		list.add(r2);
		list.add(r3);
		list.add(r4);
		
		//Creating class object 
		RoseColour colour = new RoseColour();
		//using class ref calling the method
	 	colour.findRoseColour(list);
	}

}
