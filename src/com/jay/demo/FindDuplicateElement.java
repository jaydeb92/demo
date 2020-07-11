package com.jay.demo;

public class FindDuplicateElement {

	public static void main(String[] args) {
		String[] str={"abc","def","xyz","mno","def","abc"};
		for(int i=0;i<str.length-1;i++){
			for(int j=i+1;j<str.length;j++){
				if((str[i].equals(str[j]))&&(i!=j)){
					System.out.println(str[j]);
				}
			}
			
		}

	}

}
