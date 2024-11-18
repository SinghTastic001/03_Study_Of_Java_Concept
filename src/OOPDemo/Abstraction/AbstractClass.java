package OOPDemo.Abstraction;

abstract class Student{
	abstract String getName();
	abstract String getSurname();
	
	String getSchool() {
		return "ITVEDANT";
	}
}

class Student1 extends Student{
// annotated called
	@Override
	String getName() {
		// TODO Auto-generated method stub
		return "Shubhi";
	}

	@Override
	String getSurname() {
		// TODO Auto-generated method stub
		return "Singh";
	}
	
}

class Student2 extends Student1{
	
	String getName() {
		return "Amprita";
	}
	
	String getSchool() {
		return "Hello";
		
	}
	
	String getSurname() {
		return "Dubey";
	}
}
public class AbstractClass {
	public static void main(String[] args) {
		
		Student1 s1 = new Student1();
		System.out.println(s1.getName());
		System.out.println(s1.getSurname());
		System.out.println(s1.getSchool());
		
		Student2 s2 = new Student2();
		String s = s2.getName();
		String k = s2.getSurname();
		String p = s2.getSchool();
		
		System.out.println(s);
		System.out.println(k);
		System.out.println(p);
	}

}
