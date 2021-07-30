package company.proj.java;

public class Override2 extends Override {

	
	public void marriage()
	{
		System.out.println("my marriage");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Override parent=new Override2();
		parent.property();
		
		parent.marriage();
	}

}
