package PracticeDSA;

import java.util.Scanner;

public class PalindromeString {
	
	public static String reverseString(String s)
	{

		StringBuilder sb = new StringBuilder(s);
		
		int beg = 0;
		int end = sb.length()-1;
		
		while (beg<= end)
		{
			char temp = sb.charAt(beg);
			sb.setCharAt(beg, sb.charAt(end));
			sb.setCharAt(end, temp);
			beg++;
			end--;
		}
		
		return (sb.toString());
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(s);
		
		String reversedString = reverseString(s);
		
		if(reversedString.equals(s))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		
		sc.close();
	}

}
