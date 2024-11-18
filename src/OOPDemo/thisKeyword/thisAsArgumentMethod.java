package OOPDemo.thisKeyword;
class School{
	void getStudent(Student1 s) {
		System.out.println("Getstudent method"+" "+s.id+" "+s.name);
	}
}

class Student1{
	int id=20;
	String name = "Shubhi";
	
	void getDetails() {
		School school = new School();
		school.getStudent(this);
	}
}
public class thisAsArgumentMethod {

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.getDetails();
		
	}
}
