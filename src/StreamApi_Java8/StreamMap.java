package StreamApi_Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;



class Student{
	
	int id ;
	String name;
	int mark;
	public Student(int id, String name, int mark) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mark=" + mark + "]";
	}
	
	
}

public class StreamMap {
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(1,"Shubhi",50));
		students.add(new Student(2, "Ponamm", 60));
		students.add(new Student(3,"Prema",100));
		students.add(new Student(4,"Manoj",115));
		students.add(new Student(5,"Nikita",200));
		students.add(new Student(6,"Pusha",300));
		
//		System.out.println(students);
		
//		Stream<Student> stream = students.stream();
		
//		
//		stream.forEach((data)->{
//			System.out.println(data);
//		});
		
		
//		mappppp...
//		Stream<Student> streams = students.stream().map((m)->{
//			m.mark = m.mark +1;
//			return m;
//		});
//		
//		streams.forEach((data)->{
//			System.out.println(data);
//		});
		
//		filter....
//		Stream<Student> streams = students.stream().filter((f)->{
//			return f.mark >100;
//		});
//		
//		streams.forEach((data)->{
//			System.out.println(data);
//		});;
//		
		
//		Stream<Integer> mk = students.stream().map((m)->{
//			return m.mark;
//		});
//		
//		Optional<Integer> op = mk.reduce((s,r)->{
//			return s+r;
//		});
//		
//		System.out.println(op.get());
//		
		
		
		List<Integer> mk = students.stream().map((s)->{
			return s.mark;
		}).collect(Collectors.toList());
		
		System.out.println(mk);
		
		
	}

}
