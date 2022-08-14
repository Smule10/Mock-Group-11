package logicalProgramming;

import java.util.Scanner;

public class primeNumberProgram {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Name ");
		int A = sc.nextInt();
		int Count=0;
		for(int i=2; i<A; i++)
		{
			if (A%i==0)
			{
				Count++;
				break;
			}
		}
		if (Count==1)
		{
			System.out.println("Given Number is not Prime Number");
		}
		else 
		{
			System.out.println("Given Number is Prime Number");
		}
	}

}
