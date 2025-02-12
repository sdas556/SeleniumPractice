package PracticeDSA;

public class ReverseString {

	public static void main(String[] args) {
		
		
		String s = "kadam";
		
		char a[] = s.toCharArray();
		
		int beg = 0;
		int end = s.length()-1;
		
		
		while(beg < end)
		{
			char temp = a[beg];
			a[beg] = a[end];
			a[end] = temp;
			
			beg++;
			end--;
		}
		
		
		
		String reverse = String.valueOf(a);
		System.out.println("The output:-");
		System.out.println("The reversed string: "+ reverse);

	}

}
