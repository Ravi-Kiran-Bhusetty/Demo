package maps;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapToHashSet {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(202, "Ravi");
		hashMap.put(204, null);
		hashMap.put(203, "Ravi");
		hashMap.put(null, "Kiran");
		
		HashSet<String> hashSet = new HashSet<String>(hashMap.values());
		HashSet<Integer> hashSet1 = new HashSet<>(hashMap.keySet());
		
		System.out.println(hashSet);
		System.out.println(hashSet1);

	}

}
