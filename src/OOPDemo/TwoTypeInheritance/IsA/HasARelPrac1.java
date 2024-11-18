package OOPDemo.TwoTypeInheritance.IsA;

class Itvedant1 {
	String location;
	float rating;
	
	String getIT() {
		return "This is a no return type method of parent class itvedant";
	}
}
class ItvStudent{
	
	void getStudent() {
		System.out.println("This is a method of itvedant student child class");
	}
//	Has a relationship and not here constructor made
	Itvedant1 v1 = new Itvedant1();
	
	void getStudent1() {
		System.out.println("the hello student1 method of child class");
		System.out.println(v1.getIT());
	}
}
public class HasARelPrac1 {
	public static void main(String[] args) {
		ItvStudent s1 = new ItvStudent();
		s1.getStudent1();
	}
}
