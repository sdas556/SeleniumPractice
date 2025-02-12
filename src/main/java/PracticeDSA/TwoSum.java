package PracticeDSA;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int a[]= {1,3,9,2,11,31};
		int sum = 20;
		
		
		Map<Integer,Integer> m = new HashMap<>(); 
		int flag = 0;
		for(int i = 0 ; i < a.length ; i++)
		{
			if(m.containsKey(sum-a[i]))
			{
				flag = 1;
				int num1 = sum - a[i];
				int index1 = m.get(num1);
				
				int num2 = a[i];
				int index2 = i;	
				
				System.out.println("The pair is found");
				System.out.println("1st Number: "+ num1 +" at index = "+index1 + " and 2nd Number: " + num2 +" at index= "+ index2 );
;			}
			else
			{	
				m.put(a[i], i);
			}
			
		}
		
		if(flag == 0)
		{
			System.out.println("The pair with sum: "+ sum +" is not found.");
		}
		
		

	}

}
