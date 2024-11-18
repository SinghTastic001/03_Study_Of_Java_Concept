package CollectionFramework_Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnComparable {

	public static void main(String[] args) {
		
		Animal a1 = new Animal(4, "leo", 10);
		Animal a2 = new Animal(2,"Bruno",4);
		Animal a3 = new Animal(1,"Maxo",6);
		Animal a4 = new Animal(3, "Don", 3);
		
		List<Animal> li = new ArrayList<Animal>();
		li.add(a1);
		li.add(a2);
		li.add(a3);
		li.add(a4);
		

		
		Collections.sort(li);
		System.out.println(li);
	}
}
