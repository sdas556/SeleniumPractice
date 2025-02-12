package PracticeDSA;

public class FirstOccurrenceofRepeatingCharacter {

	public static void main(String[] args) {
		
		String s = "abcccde";
		char a[] = s.toCharArray();
		
		int beg = 0;
		int end = a.length - 1;
		
		char ch = 'c';
		int index = -1;
		while(beg<=end)
		{
			int mid = beg + ((end- beg)/2);
			
			if(a[mid]==ch)
			{
				index = mid;
				end = mid-1;
			}
			else if(ch< a[mid])
			{
				end = mid - 1;
			}
			else if(ch>a[mid])
			{
				beg = mid+1;
			}
		}
		
		
		if(index == -1)
		{
			System.out.println("The character %c is not found".formatted(ch));
		}
		else if(index>=0)
		{
			System.out.println("The first occurrence of character %c is found at index = %d".formatted(ch,index));
		}
		
	}

}
