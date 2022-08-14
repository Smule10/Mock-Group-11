package Polymorphism;

public class method_Overloading {

	// Method Overloading is Example of Compile time polymorphism.
	// In Compile time polymorphism, method declaration is going to get binded with 
	// defination at compilation time based on arguments passed known as
	// Compile time polymorphism.
	// aka Early Binding.
	// once binding done , cant rebind so called as Static binding.
	
	public static void main(String[] args)
	// Declaring Multiple methods with same method name but different different arguments in same class
	// Is known as Method Overloading.
	
	{
		method_Overloading m = new method_Overloading();
		
		m.add();
		m.add(10);
		m.add(50,50);
	}

	public void add ()
	{
		int a=30;
		int b=40;
		int c= a+b;
		System.out.println("Value is "+c);
	}
	
	public void add ( int a )
	{
		int b=40;
				int c= a+b;
		System.out.println("Value is "+c);
	}
	
	public void add ( int a, int b )
	{
		int sum=a+b;
		int c= sum;
		
		System.out.println("Value is "+c);
	}
}

