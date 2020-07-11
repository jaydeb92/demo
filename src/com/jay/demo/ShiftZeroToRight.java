package com.jay.demo;

import java.util.Arrays;

public class ShiftZeroToRight {
	static void shiftZero(int []arr){
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				arr[count]=arr[i];
				count++;
			}
			
		}
		while(count<arr.length){
			arr[count]=0;
			count++;
		}
		System.out.println(Arrays.toString(arr));
		
	}
	public static void main(String[] args) {
		shiftZero(new int[]{12, 0, 7, 0, 8, 0, 3});
	}

}
