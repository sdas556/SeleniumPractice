package PracticeDSA;

public class ExtractNumberFromString {

	public static void main(String[] args) {
		String s = "sap1en5t";
		
		//Display the numbers from the String
		/*
		 * char c[] = s.toCharArray();
		 * 
		 * for(int i = 0 ; i <s.length() ; i++) { if(Character.isDigit(c[i])) {
		 * System.out.println(c[i]); } }
		 */
		
		//Extract the numbers from the String
		StringBuilder numbers = new StringBuilder();
		
		for(char c : s.toCharArray())
		{
			if(Character.isDigit(c))
			{
				numbers.append(c);
			}
		}
		
		System.out.println(numbers);

	}

}
