package Casting_study;

public abstract class non_Primitive_Casting {

	public static void main(String[] args)
	{
		father f=new father();
		
		son s= new son();
		
		father c=new son(); // creating object of Sub Class, Giving reference of Superclass.
		
		
		f.bike();
		f.car();
		System.out.println("=================================");
		
		
		s.bike();
		s.car();
		s.home(); // Not Applicable for Upcasting.
	System.out.println("=============================");	
	
	c.car();
	System.out.println("======");
	}

}
