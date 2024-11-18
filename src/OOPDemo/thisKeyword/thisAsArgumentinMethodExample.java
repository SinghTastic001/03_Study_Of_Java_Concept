package OOPDemo.thisKeyword;
class School1{
	
	void getSchool(Student2 s) {
		System.out.println("GetSchool method"+" "+s.rollno+" "+s.name);
	}
}
class Student2{
	
	int rollno = 2;
	String name = "shubhi";
	
	void getStudent() {
		School1 school = new School1();
		school.getSchool(this);
	}
}
public class thisAsArgumentinMethodExample {

	public static void main(String[] args) {
		
		Student2 s1 = new Student2();
		s1.getStudent();
	}
}
