package com.basic.prgm;

public class Reverseword {

	public static void main(String[] args) {
		
		String name ="I love Agni";
		String reverse="";
		
	String[]temp=name.split("");
	System.out.println(temp);
	
	for(int i=0;i>=temp.length-1;i--) {
		reverse=reverse+temp[i]+" ";
	}
System.out.println();
	}

}
