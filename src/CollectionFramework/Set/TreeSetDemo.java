package CollectionFramework.Set;


import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> tree = new TreeSet<Integer>();
		
		tree.add(2);
		tree.add(100);
		tree.add(20);
		tree.add(50);
		tree.add(40);
		
		System.out.println("tree set "+tree);
		System.out.println("size "+tree.size());
		System.out.println("remove "+tree.remove(100));
		
		Object[] ar = tree.toArray();
		
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		
		
	}

}
