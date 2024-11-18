package CollectionFramework.Set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class LInkedHashSetDemo {

	public static void main(String[] args) {
		
		Set<Integer> li = new LinkedHashSet<Integer>();
		
		li.add(10);
		li.add(100);
		li.add(30);
		li.add(50);
		li.add(60);
		li.add(1);
		
		System.out.println("LinkedHashset "+li);
		System.out.println("size "+li.size());
		System.out.println("remove "+li.remove(50));
		
		Object[]  ar = li.toArray();
		System.out.println(Arrays.toString(ar));
		
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
}
