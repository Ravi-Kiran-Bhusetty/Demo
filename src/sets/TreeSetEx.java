package sets;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetEx {

	public static void main(String[] args) {
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(-5);
		treeSet.add(58);
		treeSet.add(52);
		treeSet.add(6);
		treeSet.add(0);
		treeSet.add(54);
		treeSet.add(58);
		treeSet.add(65);
		
		Iterator<Integer> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}

	}

}
