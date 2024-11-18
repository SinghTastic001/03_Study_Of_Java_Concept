package CollectionFramework.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		Set<Integer> hs = new HashSet<Integer>();
		hs.add(4);
		hs.add(90);
		hs.add(100);
		hs.add(89);
		hs.add(500);
		hs.add(40);
		hs.add(2);
		
		System.out.println("hashset "+hs);
		System.out.println("size "+hs.size());
		System.out.println("remove "+hs.remove(2));
		
		Object[] ob = hs.toArray();
		System.out.println(Arrays.toString(ob));
		
		for(int i=0; i<ob.length; i++) {
			System.out.println(ob[i]);
		}
		
//		second way 
		
		Iterator<Integer> it =  hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
