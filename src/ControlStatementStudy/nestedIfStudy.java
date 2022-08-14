package ControlStatementStudy;

public class nestedIfStudy {

	public static void main(String[] args) 
	{
	
		// if UN is correct then enter PWD;
		//if PWD is correct then login succesful;
		// else PWD is wrong-- enter valid PWD;
		//else UN is incorrect then enter valid UN

		String UN= "shiv=";
		String PWD= "shiv@123";
		
		if (UN=="shiv")
		{
			System.out.println("Correct UN, please enter PWD");
		
			 if (PWD=="shiv@123")
		    {
		      	System.out.println("Correct PWD, Login Succesful");
		    }
		     else 
		    {
			    System.out.println("Please enter Valid PWD");
		    }
		}
		else 
		{
			System.out.println("Please enter valid UN");
			
		} 
		
		
	}
}