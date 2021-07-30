package com.java.practice;

public class Benz implements Interface1,Interface2{
	

	public void Employeedetails()
	{
		System.out.println("no of Employee");
		
	}
	
	public void Employerdetails()
	{
		System.out.println("postion of Employer");
	}
	
public void Customerdetails()
{
	System.out.println("no of Customer");
}

	
	public void ventordetails()
	
	{
		System.out.println("postion of ventor");
	}
	
	
	public static void main(String[] args) {
		
		Interface2 car=new Benz();
	car.Customerdetails();
     car.ventordetails();
		/*car.Employeedetails();
		car.Employerdetails();*/
        
	}

}
