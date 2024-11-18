package OOPDemo.TwoTypeInheritance.IsA;

//this is a has a relationship inheritance in which a object is made inside other class of own file not it's own class.

class Itvedant{
	String Location;
	float Rating;
	
	String getinfo1() {
//		System.out.println("method of Itvedant");
		return "This is a method of Itvedant";
	}
}

class VdntStudent{
	
	VdntStudent(int a){
		System.out.println("Vdnt Student custom Constructor"+a);
	}
	
//	Itvedant vd = new Itvedant(); first way to make object
	
	Itvedant vd;
//	this is a second way of making object here constructor ke ander object parent class ka bana h
	VdntStudent(){
		vd = new Itvedant();
		
	}
	
	void getItvedant() {
		System.out.println(vd.getinfo1());
		System.out.println("this is method of Vdnstudent");
	}
}
public class HasARealtionship {

	public static void main(String[] args) {
		VdntStudent v = new VdntStudent();
		v.getItvedant();
	}
}
