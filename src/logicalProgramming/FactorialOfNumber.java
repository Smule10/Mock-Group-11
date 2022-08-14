package logicalProgramming;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		int Num = sc.nextInt();
        int C=1;
        for (int i=Num; i>=1; i--)
        {
        	C=C*i;
        }
        System.out.println("Factorial of "+Num+" is "+C);
	}

}
