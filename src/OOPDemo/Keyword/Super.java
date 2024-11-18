package OOPDemo.Keyword;
class Animal{
	String name;
	
	void makeSound() {
		System.out.println("Some generic animal sound");
	}
	String getcolor() {
		return "Black";
	}
}
class Dog extends Animal{
	String breed;
	void makeSound() {
		super.makeSound();
		System.out.println("Woof! Woof!");
	}
	String getcolor() {
//		super.getcolor(); it not work on return type
		return "Skiny";
	}
	void getDet() {
		System.out.println("child class"+" "+getcolor());
		System.out.println("parent class"+" "+super.getcolor());
//		it is working on print
	}
}
public class Super {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.makeSound();
		System.out.println(d.getcolor());
		d.getDet();
	}
}
