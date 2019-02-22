package lists;

import java.util.ArrayList;

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
	}

}
