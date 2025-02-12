package PracticeDSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleDuplicateNumber {
	
	public static boolean compare(int a,int b)
	{
		return a<b?true:false;
	}

	public static void main(String[] args) {
		
		int a[]= {1,34,4,3,2,4};
		
		Map<Integer,Integer> m = new HashMap<>();
		
		for(int i = 0; i < a.length ;i++)
		{
			m.put(a[i],m.getOrDefault(a[i], 0)+1);
			
			if(m.get(a[i])>=2)
			{
				System.out.println("The duplicate number is %d".formatted(a[i]));
				break;
			}
		}
		
	}

}
