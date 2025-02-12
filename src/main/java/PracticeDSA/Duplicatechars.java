package PracticeDSA;

import java.util.HashMap;
import java.util.Map;

public class Duplicatechars {

	public static void main(String[] args) {
		String s = "ay bcd dert c ";
		
		char a[]= s.toCharArray();
		
		Map<Character, Integer> m = new HashMap<>(); 
		
		for(int i = 0 ; i < a.length; i++)
		{
			if(m.containsKey(a[i]))
			{
				m.put(a[i], m.get(a[i])+1);
			}
			else
			{
				m.put(a[i], 1);
			}
		}
		
		
		for(Map.Entry<Character, Integer> pair : m.entrySet())
		{
			if(pair.getValue()>=2)
			{
				System.out.println(pair.getKey() + " : " + pair.getValue());
			}
		}	
		
		

	}

}
