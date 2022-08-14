package Polymorphism;

// RunTime Polymorphism
// A polymorphism in which method declaration is going to get binded with the definition
// at the time of execution/run time based on object creation called as run time polymorphism. 
// Binding is going to done at time of runtime so its Late Binding.
// Once binding done, we can change binding so called as Dynamic Binding.

public class method_Overriding extends Runtime

{
// Acquiring Super class method  into Sub Class using extend keywords 
	// and Changing definitions according to  subclass specification called as method overriding.
	
	public static void main(String[] args) {
		method_Overriding M= new method_Overriding();
		M.Son();
		M.father();

	}

	public void Son ()
	{
		System.out.println("Money is 5000");
	}
}
