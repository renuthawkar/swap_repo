package com.array;

public class minimum_num {
	
	public static void main(String[] args) {
		
		int [] a= {4,3,5,2,6};
		
	
	//	int o = 0;
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			
			if(a[i]<min) {
				min=a[i];
				
			}
			
		}
		System.out.println(min);
		
	}

}
