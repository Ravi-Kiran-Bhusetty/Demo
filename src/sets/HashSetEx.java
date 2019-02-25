package sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(null);
		hashSet.add(58);
		hashSet.add(52);
		hashSet.add(6);
		hashSet.add(11);
		hashSet.add(54);
		hashSet.add(58);
		hashSet.add(65);
		
		Iterator<Integer> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}

	}

}
