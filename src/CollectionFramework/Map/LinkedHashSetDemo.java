package CollectionFramework.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		
		Map<Integer, String> mp1 = new LinkedHashMap<Integer, String>();
		
		mp1.put(1, "romi");
		mp1.put(2, "rahul");
		mp1.put(3, "sonam");
		mp1.put(4, "ananya");
		mp1.put(5, "ritika");
		
		System.out.println("linkedhashMap "+mp1);
		System.out.println("size "+mp1.size());
		System.out.println("remove "+mp1.remove(4));
		
		System.out.println("keys "+mp1.keySet());
		System.out.println("values "+mp1.values());
		
		for(Integer i: mp1.keySet()){
			System.out.println(mp1.get(i));
		}
		
		System.out.println("second way ");
		
		for(Entry<Integer, String> i: mp1.entrySet()) {
			System.out.println(i);
		}
	}

}
