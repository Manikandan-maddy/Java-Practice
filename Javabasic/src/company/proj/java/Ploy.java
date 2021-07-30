package company.proj.java;

public class Ploy {

	
	public void talk(Parents speakingofdad)
	{
		System.out.println("respectful");
	}
	
	public void talk(Child speakingoflove)
	{
		System.out.println("respectful");
	}
	
	
	
	public static void main(String[] args) {
		Ploy poly=new Ploy();
				Parents parent=new Parents();
				poly.talk(parent);
				Child child=new Child();
				poly.talk(child);

	}

}
