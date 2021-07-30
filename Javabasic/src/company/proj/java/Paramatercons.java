package company.proj.java;

public class Paramatercons {

	String animal_name;
	String animal_type;
	
	
	Paramatercons(String name,String type)
	{
		
		animal_name=name;
		animal_type=type;
		
		System.out.println("THe animal is"+animal_name+"type of animal"+animal_type);
		
	}
	

	
	public static void main(String[] args) {
		Paramatercons cons=new Paramatercons("Duck","bird");

	}

}
