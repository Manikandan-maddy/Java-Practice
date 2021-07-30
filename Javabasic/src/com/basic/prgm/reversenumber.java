package com.basic.prgm;

public class reversenumber {

	public static void main(String[] args) {
	
		
		int givennumber=123;
		int reverse=0;
		
		while(givennumber!=0){
		reverse=reverse*10;
		reverse=reverse+givennumber%10;
		givennumber=givennumber/10;
		}
	
		System.out.println(reverse);
		
		
		
		
	

	
	}

}
