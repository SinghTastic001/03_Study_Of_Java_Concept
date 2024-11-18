	package CollectionFramework_Comparable_Comparator;
	
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;
	
	public class LearnComparator {
		
		
	
		public static void main(String[] args) {
			
			AnimalComparator a1 = new AnimalComparator(4, "leo", 10);
			AnimalComparator a2 = new AnimalComparator(4, "jeo", 40);
			AnimalComparator a3 = new AnimalComparator(4, "aeo", 20);
			AnimalComparator a4 = new AnimalComparator(5, "keo", 30);
			
			List<AnimalComparator> li = new ArrayList<AnimalComparator>();
			
			li.add(a1);
			li.add(a2);
			li.add(a3);
			li.add(a4);
			
			Collections.sort(li, new AnimalComparator());
			System.out.println(li);
			
			Collections.sort(li, new Comparator<AnimalComparator>() {

				@Override
				public int compare(AnimalComparator o1, AnimalComparator o2) {
					
					return o1.age - o1.age;
				}
				
			});
			
		}
	
	}
