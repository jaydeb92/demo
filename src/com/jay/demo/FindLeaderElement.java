package com.jay.demo;

import java.util.Arrays;

public class FindLeaderElement {
	static void fintTheLeaders(int arr[]){
		int i=arr.length;
		System.out.println("The leader arrays "+Arrays.toString(arr)+"are:");
		int max=arr[i-1];
		System.out.println(arr[i-1]);
		for(int j=arr.length-2;j>=0;j--){
			if(arr[j]>max){
				System.out.println(arr[j]);
				max=arr[j];
			}
		}
		
	}
	public static void main(String[] args) {
		fintTheLeaders(new int[]{8, 23, 19, 21, 15, 6, 11});
	}

}
