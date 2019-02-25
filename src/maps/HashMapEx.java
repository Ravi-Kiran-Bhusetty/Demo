package maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ForkJoinWorkerThread;

public class HashMapEx {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(202, "Ravi");
		hashMap.put(204, null);
		hashMap.put(203, "Ravi");
		hashMap.put(null, "Kiran");
		
		
		for(Map.Entry m : hashMap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		
		System.out.println(hashMap.values());
		System.out.println(hashMap.keySet());
		
	
	}
	
}
