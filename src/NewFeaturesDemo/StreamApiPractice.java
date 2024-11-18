package NewFeaturesDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Student2{
	
	int id;
	String name;
	int mark;
	
	public Student2(int id , String name , int mark) {
		this.id = id;
		this.name = name;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", mark=" + mark + "]";
	}
	
	
}
public class StreamApiPractice {
	
	public static void main(String[] args) {
		
					List<Student2> students = new ArrayList<Student2>();
					
					students.add(new Student2(1,"shubhi",50));
					students.add(new Student2(2,"Hardik",90));
					students.add(new Student2(3,"Prema",100));
					students.add(new Student2(4,"Manoj",115));
					students.add(new Student2(5,"Nikita",200));
					students.add(new Student2(6,"Pusha",300));
					
//					System.out.println(students);
//					
					Stream<Student2> stream = students.stream();
//					
					stream.forEach((rs)->{
						System.out.println(rs);
					});
//					
					Stream<Student2> stream1 = students.stream().map((s) ->{
						s.mark = s.mark +1;
						return s;
					});
					
					stream1.forEach((s)->{
						System.out.println(s);
					});
					
					Stream<Student2> stream2 = students.stream().filter((f)->{
						return f.mark > 100;
					});
					
					stream2.forEach((r)->{
						System.out.println(r);
					});
					
					
		
	}

}
