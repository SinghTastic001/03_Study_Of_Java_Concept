package CollectionFramework.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<Integer> arli = new ArrayList<Integer>();
		
		arli.add(10);
		arli.add(20);
		arli.add(40);
		arli.add(70);
		arli.add(80);
		arli.add(90);
		arli.add(100);
		arli.add(150);
		
		System.out.println("all data of arraylist "+arli);
		System.out.println("size "+arli.size());
		System.out.println("contains" + arli.contains(10));
		System.out.println("rmove by object "+Integer.valueOf(10));
		System.out.println("remove "+arli.remove(0));
		System.out.println("replace "+arli.set(1, 200));
		
		for(int i=0; i<arli.size(); i++) {
			System.out.println(arli.get(i));
		}
	}
}
