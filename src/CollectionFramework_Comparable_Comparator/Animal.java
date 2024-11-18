package CollectionFramework_Comparable_Comparator;

public class Animal implements Comparable<Animal> {

	int age;
	String name;
	int weight;
	public Animal(int age, String name, int weight) {
		super();
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Animal [age=" + age + ", name=" + name + ", weight=" + weight + "]";
	}
	@Override
	public int compareTo(Animal that) {
		// TODO Auto-generated method stub
		  return this.age - that.age;
		  
//		  this object bigger return positive
//		  this object smaller return negative
//		  this object that object equal return zero
	
	}
	
	
	
	
}
