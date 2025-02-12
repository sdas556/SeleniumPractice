package PracticeDSA;





public class IntegerToCharAndCharToInteger {

	public static void main(String[] args) {
		
		int n = 5;
		
		/*Pattern 1
		A 
		A B 
		A B C 
		A B C D 
		A B C D E 

		*/
		/*
		 * for(int i = 1; i <= n; i++) { for(int j = 1 ; j<=i ; j++) {
		 * 
		 * System.out.print((char)(64 + j)+" "); }
		 * 
		 * System.out.println(); }
		 */	

		/*Pattern 2
		A 
		B B 
		C C C 
		D D D D 
		E E E E E 

		*/
		/*
		 * for(int i = 1; i <= n; i++) { for(int j = 1 ; j<=i ; j++) {
		 * 
		 * System.out.print((char)(64 + i)+" "); }
		 * 
		 * System.out.println(); }
		 */
		
		
		/*Pattern 3
		A 
		B C 
		C D E 
		D E F G  
		E F G H I 

		*/
		
		int k = 0;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1 ; j<=i ; j++)
			{
				
				System.out.print((char)(64 + j + i-1)+" ");
			}
			k++;
			
			System.out.println();
		}
	}

}
