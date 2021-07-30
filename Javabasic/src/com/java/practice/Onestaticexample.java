package com.java.practice;

public class Onestaticexample {

	static int rollno=0;
	String name;
	
	public static void var()
	{
		System.out.println(rollno);
		
	}
	static {
		System.out.println("The Static Method 0");
	}
	
	public static void method()
	{
		System.out.println("The Static Method 1");
	}
	
	public static void madurai()
	{
		System.out.println("The Static Method 2");
	}
	
	public void chennai(String s)
	{
		name=s;
       System.out.println("The Non Static Method");		
       System.out.println("name"+name);
	}
	

	
	
	public static void main(String[] args) {
		
		rollno=36;
		var();
		method();
		madurai();
		Onestaticexample object=new Onestaticexample();
		object.chennai("karthik");
	    object.name="Karthik";	

	}

}
