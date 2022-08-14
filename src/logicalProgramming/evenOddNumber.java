package logicalProgramming;

import java.util.Scanner;

public class evenOddNumber {

	public static void main(String[] args) 
	{
		// /== Division,  % == Reminder
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
             int A = sc.nextInt();  
             
             int C=0;
            if ( A%2==1)
            {
            	System.out.println("Given Number is Odd");
            }
            else 
            {
            	System.out.println("Given Number is Even");
            }
	}
}
