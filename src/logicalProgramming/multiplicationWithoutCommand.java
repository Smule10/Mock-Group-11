package logicalProgramming;

import java.util.Scanner;

public class multiplicationWithoutCommand {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number");
	    int A = sc.nextInt();// 5
		System.out.println("Enter 2nd Number");
		int B = sc.nextInt(); // 6
		int Mul = 0;
		
		for (int i=1; i<=B; i++) // 1,2,3,4,5,6
		{
			Mul=Mul+A; // 5,10,15,20,25,30
		}
		
		System.out.println("Multiplication is "+Mul);

	}

}
