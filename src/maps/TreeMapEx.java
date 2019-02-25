package maps;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapEx {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(202, "Ravi");
		treeMap.put(204, null);
		treeMap.put(203, "Ravi");
		treeMap.put(201, "Kiran");
		
		for(Map.Entry m : treeMap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}


	}

}
