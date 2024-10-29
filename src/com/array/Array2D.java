package com.array;

public class Array2D {
	
	public static void main(String[] args) {
		
		int[][] a = {{10,20,30}, {40,50}};
		
		int total = 0;
		for(int i = 0 ; i<a.length;i++) {
			
			for(int j = 0 ; j<a[i].length;j++) {
				
				
				total=total+j;
				
			}
				
			
			total=total+i;
			
		}
		
		System.out.println(total);
	}

}
