package com.array;

public class linearSearch {
	
	public static void main(String[] args) {
		
		int [] arr={5,3,6,1,4,7};
		
		int item=9;
	int 	temp=0;
		for(int i=0;i<arr.length;i++) {
			
			if (arr[i]==item) {
				
				System.out.println("element present at"+  i  );
				
			    temp=	temp+1;
			}
			
		}
		
	
if(temp==0)
		{
			System.out.println("is not prent in index");
			
		}
		
		
	} 
	

}
