package String_study;

public class String_methods {
	
	
	// objects created are going to get stored in Static Pool Area, Which is in heap area.
	// Static Pool Area have two types-
	//1 Constant pool Area. 
	//2. Non Constant pool area.
	

	public static void main(String[] args) 
	{
         // Object Creation Without Using New Keyword. Object gets stored in COnstant pool Area
		String P= "Pune";
		String M= "Mumbai";
		
		// Object creation with New Keyword, objects get Stored in Non Constant pool Area
		String N= new String("Nanded");
		String A= new String("Aurangabad");
		
		System.out.println(P);
		System.out.println(M);
		System.out.println(N);
		System.out.println(A);
	}

}
