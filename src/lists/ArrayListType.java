package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListType {

	public static void main(String[] args) {
	
		ArrayList al = new ArrayList();
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();
		al1.add(408);
		al1.add(410);
		al2.add(408);
		al2.add(410);
		al2.addAll(al1);
		al.add("Ravi");
		al.add(444);
		al.addAll(al1);
		System.out.println(al);
		System.out.println(al.get(2));//If both lists are same time, the shifting of elements take place and one index has only one value
		System.out.println(al2);
		Iterator<Integer> iterator = al2.iterator();//Preferred to use
		while(iterator.hasNext())
			System.out.println("Element "+iterator.next());
		for (Integer integer : al2) {
			System.out.println("Element is "+integer);//Used for arrays
		}
		
		Collections.sort(al2);
		Iterator itr = al2.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}
