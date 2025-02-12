package PracticeDSA;

import java.util.Collections;
import java.util.Stack;

public class ReverseStringwithcorrectwords {

	public static void main(String[] args) {
		String s = "I am a wonderful man";
		
		String words[] = s.split(" +");
		
		Stack<String> stk = new Stack<String>();
		String result ="";
		
		
		for(String word : words )
		{
			stk.push(word);
		}
		
		/*
		 * while(!stk.isEmpty()) { result = result + stk.pop()+" "; }
		 */
		
		//Better implementation
		
		while(!stk.isEmpty())
		{
			result = result + stk.pop();
			if(!stk.isEmpty())
			{
				result = result + " ";
			}
		}
		
		System.out.println("The original string: "+ s);
		System.out.println("The final result: "+ result);
	}

}
