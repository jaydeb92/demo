package com.jay.demo;

public class PairOfElementOfArrayAlternate {
	static void findPairOfElement(int arr[],int num){
		int j=arr.length-1;
		int i=0;
		while(i<j){
			if(arr[i]+arr[j]==num){
				System.out.println(arr[i]+"+"+arr[j]+"=="+num);
				
				i++;
				j--;
			}
			 
			else if(arr[i]+arr[j]<num){
				i++;
			}
			
			else if(arr[i]+arr[j]>num){
				j--;
				
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		findPairOfElement(new int[]{1,5,6,10,-4,4}, 1);
	}

}
