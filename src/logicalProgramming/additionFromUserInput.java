package logicalProgramming;

import java.util.Scanner;

public class additionFromUserInput {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter 1st Number");
		int A = sc.nextInt();
		System.out.println("Please Enter 2nd Number");
		int B = sc.nextInt();
	    
	    
	   int Sum = (A+B);
	   System.out.println("Addition is "+Sum);
		
		

	}

}
