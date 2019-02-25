package lists;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<Integer>();//LinkedList<Integer> l = new LinkedList<Integer>();
														// LinkedList takes more time to add elements at the end
		for (int i = 0; i < 10e6; i++) {				//But it takes less time when we try to add in between
			l.add(i);
		}
		long start = System.currentTimeMillis();
		
		for (int i = 7; i < 10e4; i++) {
			l.addLast(i);
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
	}

}
