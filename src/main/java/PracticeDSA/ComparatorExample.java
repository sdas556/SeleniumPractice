package PracticeDSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ComparatorExample {
	
	/*
	 * static Comparator compare = new Comparator<Integer>() {
	 * 
	 * @Override public int compare(Integer o1, Integer o2) {
	 * 
	 * if((o1%10)>(o2%10)) return 1; else return -1; }
	 * 
	 * };
	 */

	public static void main(String[] args) {
		
		Comparator<Integer> compare = (o1, o2) -> {
				
				if((o1%10)>(o2%10))
					return 1;
				else 
					return -1;
			
			
		};
		
		
		List<Integer> l = new ArrayList<>(); 
		
		l.add(34);
		l.add((int)'a');
		l.add(1);
		l.add(19);
		l.add(23);
		System.out.println("Before Sorting "+l);
		
		Collections.sort(l, compare);

		System.out.println("After Sorting "+l);
	}

}
