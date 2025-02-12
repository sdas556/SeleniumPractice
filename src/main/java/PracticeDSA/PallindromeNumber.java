package PracticeDSA;

import java.util.Scanner;

public class PallindromeNumber {

	public static int reverseNumber(int n)
	{
		int rev= 0;
		while(n>0)
		{
			int digit = n % 10 ;
			rev =rev*10 + digit ;
			n = n / 10 ;
		}
		
		return rev;
		
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the number to check whether it is a Palindrome number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int reversedNumber = reverseNumber(num);
		
		if(num == reversedNumber)
		{
			System.out.println("%d is a Palindrome number".formatted(num));
		}
		else
		{
			System.out.println("%d is not a Palindrome number".formatted(num));
		}
		
	}

}
