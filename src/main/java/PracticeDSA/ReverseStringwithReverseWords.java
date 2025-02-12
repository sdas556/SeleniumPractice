package PracticeDSA;

import java.util.Stack;

public class ReverseStringwithReverseWords {

	public static void main(String[] args) {
		
		
		String s = "I am a      wonderful man";
		
		String words[] = s.split(" +");
		
		Stack<String> stk = new Stack<String>();
		String result ="";
		
		
		for(String word : words )
		{
			StringBuilder reverseWord = new StringBuilder(word);
			reverseWord.reverse();
		
			
			stk.push(reverseWord.toString());
		}
		
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
