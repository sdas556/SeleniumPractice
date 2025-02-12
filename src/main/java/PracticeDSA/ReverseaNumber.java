package PracticeDSA;

public class ReverseaNumber {

	public static void main(String[] args) {
		
		int num = 5431;
		int rev = 0;
		while (num>0)
		{
			int digit = num % 10 ;
			rev = rev*10 + digit;
			num = num/10;
		}
		
		System.out.println("The sum of the digits is: "+ rev);

	}

}
