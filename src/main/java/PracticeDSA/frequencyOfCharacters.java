package PracticeDSA;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class frequencyOfCharacters {

	public static void main(String[] args) {
		
		int vowel = 0;
		System.out.println("Enter 1 if Only vowel count is required ");
		System.out.println("Enter 0 if All character count is required \n");
		Scanner sc = new Scanner(System.in);
		vowel = sc.nextInt();
		
		String s = "aaa ee aei ovh uu";
		
		char[] a = s.toCharArray();
		
		Map<Character,Integer> m = new LinkedHashMap<>();
		
		for(int i = 0 ; i < s.length(); i++)
		{
			if(a[i]==' ')
			{
				System.out.println(a[i]);
				continue;
			}
			else if(vowel==1 && !(Character.toUpperCase(a[i]) == 'A'|| Character.toUpperCase(a[i]) == 'E'||Character.toUpperCase(a[i]) == 'I'|| Character.toUpperCase(a[i]) == 'O'|| Character.toUpperCase(a[i]) == 'U'))  
			{
				System.out.println(a[i]);
				continue;
			}
			else if(m.containsKey(a[i]))
			{
				int count = m.get(a[i]) + 1;
				m.put(a[i], count);
			}
			else {
				m.put(a[i], 1);
			}
			
		}
		
		System.out.println(m);
		
		for(Map.Entry<Character, Integer> e : m.entrySet() ) // or for(Map.Entry<Character, Integer> e : m.entrySet() )
		{
			System.out.println("Character: "+ e.getKey());
			System.out.println("Value: "+ e.getValue() );
		}	

	}

}
