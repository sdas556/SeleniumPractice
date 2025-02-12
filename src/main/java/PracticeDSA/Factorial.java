package PracticeDSA;

import java.util.Scanner;

public class Factorial {
	
	/*
	 * public static int factorialofNumber(int num) { //int n = num; int fact = 1;
	 * while(num > 0) { fact = fact * num; num--; }
	 * 
	 * return fact;
	 * 
	 * }
	 */
		
	
	public static int factorialWithRecursion(int num)
	{
		if(num == 0 || num == 1)
		{
			return 1;
		}
		
		else
		{
			return num*factorialWithRecursion(num-1);
		}
	}
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for finding factorial: ");
		int number =sc.nextInt();
	
		//int result = factorialofNumber(number);
		int result = factorialWithRecursion(number);
		
		System.out.println("The factorial of the number %d is: %d".formatted(number,result));
		sc.close();
	}	
}
