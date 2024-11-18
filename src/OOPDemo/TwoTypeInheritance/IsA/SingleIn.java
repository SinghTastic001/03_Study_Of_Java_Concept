package OOPDemo.TwoTypeInheritance.IsA;

// Is-A-RelationShip or Is-A-Inheritance

class Institue{
	
	String name;
	String location;
	double d;
	
	void getInsInfo() {
		System.out.println("It is a best institue");
	}
	
	void getDetails(String name, String location , double d) {
		this.name = name;
		this.location = location;
		this.d = d;
		System.out.println(name+" "+location+" "+d);
	}
}


class Student extends Institue{
	
	String stName;
	String stLocation;
	String stSurname;
	
	void getStuInfo() {
		System.out.println("I am a best Student");
	}
	
	void getDetails(String stName , String stLocation, String stSurname) {
		this.stName = stName;
		this.stLocation = stLocation;
		this.stSurname = stSurname;
		System.out.println(stName+" "+stLocation+" "+stSurname);
	}
}


public class SingleIn {

	public static void main(String[] args) {
		
		Institue ins = new Institue();
		ins.getInsInfo();
		ins.getDetails("Tech", "Borivali", 4.0);
		
		Student st = new Student();
		st.getStuInfo();
		st.getInsInfo();
		
	}
}
