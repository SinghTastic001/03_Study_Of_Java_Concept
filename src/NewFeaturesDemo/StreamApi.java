package NewFeaturesDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Student{
	
	int id;
	String name;
    int mark;
    
    public Student(int id, String name , int mark){
    	this.id = id;
    	this.name = name;
    	this.mark = mark;
    	
    }

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mark=" + mark + "]";
	}

	
    
}
public class StreamApi {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(1,"shubhi",50));
		students.add(new Student(2,"Hardik",90));
		students.add(new Student(3,"Prema",100));
		students.add(new Student(4,"Manoj",115));
		students.add(new Student(5,"Nikita",200));
		students.add(new Student(6,"Pusha",300));
		
//		System.out.println(students);
		
		Stream<Student> stream = students.stream();
		
//		foreach method
		
//	    stream.forEach((student) -> {
//			System.out.println(student);
//		});
		
//		System.out.println(students);
	    
//		map method
	   stream = stream.map((s) -> {
	    	s.mark = s.mark + 1;
	    	return s;
	    });
		
//		answer not come
	   
//		Stream<Student> = students.stream().filter((s) ->{
//			return s.mark>50;
//		});
//		System.out.println(students);
//		
//		answer  not come
	   
		
		
	}
}
