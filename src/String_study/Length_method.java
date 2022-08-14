package String_study;

public class Length_method {

	public static void main(String[] args) 
	{
		// Length Method to calculate Length.
		
		String P= "Pune";
		String M= "Mumbai";
		String N= new String("   ^ ");
		String A= new String("Aurangabad");
		
		System.out.println(N.length());
         int myLength= N.length();
         System.out.println(myLength);
         System.out.println("======================================");
         
         // 2. toUpperCase
   
         
         System.out.println(M.toUpperCase());
         System.out.println("======================================");
         String myUp = A.toUpperCase();
         System.out.println(myUp);
         System.out.println("======================================");
         
         // 3. toLower Case
         
         System.out.println(P.toLowerCase());
         System.out.println("======================================");
         
         
         // 4. Equals
         
         // ==  this will check memory location not the contain.
         
         System.out.println(P==M);
         System.out.println(N==A);
         System.out.println(P==N);
         System.out.println("======================================");
         
         
       //   System.out.println(object.Equal(object)); This will check Containt, not memory Location.
         
         System.out.println(P.equals(N));
         System.out.println("======================================");
         
         
         // 5. Ignoring Case Sensitive
         
         // This method use to ignore Case SENSITIVITY While Performing Equals.
         System.out.println(P.equalsIgnoreCase(N));
         System.out.println("======================================");
         
         
        // 6. Contains
           // Check Specific Sequence of Char. Values.
         
         System.out.println(P.contains(N));
         System.out.println("======================================");
         
         // 7. isEmpty
         // Check String Empty or Not. Result True only if Length is Zero.
         
         System.out.println(P.isEmpty());
         System.out.println("======================================");
         System.out.println(N.isEmpty());
         System.out.println("======================================");
         // 8. isBlank 
         // Only white Space allowed. NO Contain.
         
         System.out.println(N.isBlank());
         System.out.println("======================================");
         
         // 9. CharAt   ....  Checking character at defined index.
         
         System.out.println(A.charAt(4));
         System.out.println("======================================");
         System.out.println(N.charAt(3));
         System.out.println("======================================");
         
         // 10. endsWith ... Tests if this string ends with the specified Suffix.
         
         System.out.println(P.endsWith("Ne"));
         
         
         
	}

}
