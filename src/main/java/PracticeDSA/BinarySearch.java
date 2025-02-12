package PracticeDSA;


import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		int a []= {10,3,6,12,2,5,19,3};
		
		System.out.println("Enter the number to be searched: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int flag = 0;
		
		
		int beg = 0;
		int end = a.length - 1;
		
		Arrays.sort(a);
		
		while(beg <= end)
		{
			int mid = (beg + end)/2;
			
			if(a[mid] == num)
			{
				flag = 1;
				//System.out.println(MessageFormat.format("Number {0} Found", num)); //alternate way of display
				System.out.println("Number %d was found in Index %d".formatted(num,mid));
				break;
			}	
			else if(num< a[mid])
			{
				end = mid - 1 ;
			}	
			else
			{
				beg = mid + 1;
			}
		}
		
		if(flag == 0)
		{
			System.out.println(String.format("Number %d not found in the array", num) );
		}
		sc.close();

	}

}
