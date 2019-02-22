package lists;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("Ravi");
		al.add(408);
		al.add("Kiran");
		al.add('B');
		System.out.println(al);
		
		al.add(2,'K');
		System.out.println(al);// K gets inserted into 2nd index and rest all shifts to right - Dynamic growing
	}

}
