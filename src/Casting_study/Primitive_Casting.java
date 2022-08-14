package Casting_study;

public class Primitive_Casting 
// Converting one data type of information into another data type is known as Casting.
// Two Types  1- Primitive Types   2. non Primitive 
// Primitive Casting is classified into 3 types 1.Implicit 
// 2. Explicit ... 3. Boolean Casting.

{

	public static void main(String[] args) {
		
		// *Implicit Casting*
		// Converting lower data type into Higher Data type called as Implicit Casting.
		//No Memory Loss
		// A K A - Widening Casting.
		
		int a = 5;  //  Memory Size is 4 byte.
		System.out.println("Value of A is "+a);

		double b=a ; // Memory Size of Double is 8 byte.
		
		System.out.println("Value of B is "+b);
		System.out.println("================================");
		
		
		// Explicit Casting 
		// Converting Higher Data type into Lower data type called as Explicit Casting.
		// A K A- Narrowing casting as memory size goes on decreasing.
		// Memory loss takes Place in this Casting.
		
		
		double d=30.6;     // Memory size is 8 byte.
		System.out.println("Value of D is "+d);
		
		
		int C= (int) d;
		System.out.println("Value of c is "+C);
		
		
	}

	
	
	
}
