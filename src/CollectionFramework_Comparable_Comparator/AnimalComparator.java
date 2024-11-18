package CollectionFramework_Comparable_Comparator;

import java.util.Comparator;

public class AnimalComparator implements Comparator<AnimalComparator> {

	int age;
	String name;
	int weight;
	public AnimalComparator(int age, String name, int weight) {
		super();
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	@Override
	public int compare(AnimalComparator o1, AnimalComparator o2) {
		// TODO Auto-generated method stub
		return o1.weight-o2.weight;
	}
	public AnimalComparator() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AnimalComparator [age=" + age + ", name=" + name + ", weight=" + weight + "]";
	}
	
	
	
	
}
