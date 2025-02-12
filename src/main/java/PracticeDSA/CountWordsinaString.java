package PracticeDSA;

import java.util.HashMap;
import java.util.Map;

public class CountWordsinaString {

	public static void main(String[] args) {
		String s = "There are five chickens in the room chickens are crazy five five";
		
		Map<String, Integer> m = new HashMap<>();
		
		for(String word : s.split("\\s"))
		{
			m.put(word, m.getOrDefault(word, 0)+1);
		}
		
		for(Map.Entry<String, Integer> pair : m.entrySet() )
		{
			System.out.println(pair.getKey()+" : "+ pair.getValue());
		}

	}

}
