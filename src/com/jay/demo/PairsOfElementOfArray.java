package com.jay.demo;

public class PairsOfElementOfArray {
	static void findThePairs(int arr[], int num){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==num){
					System.out.println(arr[i]+"+"+arr[j]+"=="+num);
				}
			}
			
		}
		
	}
	public static void main(String[] args) {
		findThePairs( new int[]{1,5,9,10,0,-20,8},10);
		
	}

}
