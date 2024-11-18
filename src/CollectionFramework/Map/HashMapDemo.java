package CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		Map<Integer, String> mp = new HashMap<Integer, String>();
		
		mp.put(1, "mango");
		mp.put(2, "apple");
		mp.put(3, "orange");
		mp.put(4, "grapes");
		mp.put(5, "papaya");
		mp.put(6, "kiwi");
		
		System.out.println("map "+mp);
		System.out.println("size "+mp.size());
		System.out.println("remove "+mp.remove(3));
		
		System.out.println("keys "+mp.keySet());
		System.out.println("values "+mp.values());
		
		for(Integer i: mp.keySet()) {
			System.out.println(mp.get(i));
		}
		
		for( Entry<Integer, String> i: mp.entrySet()) {
			System.out.println(i);
		}
		
		
	}

}
