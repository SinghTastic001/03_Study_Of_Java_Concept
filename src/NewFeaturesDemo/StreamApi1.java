package NewFeaturesDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student1{
	
	int id;
	String name;
	int mark;
	
	public Student1(int id , String name , int mark) {
		
		this.id= id;
		this.name = name;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", mark=" + mark +  "]";
	}
	
	
	
}
public class StreamApi1 {
	
	public static void main(String[] args) {
		
		
		List<Student1> list = new ArrayList<Student1>();
		
		list.add(new Student1(1, "Rohit",80));
		list.add(new Student1(2,"pushpa",90));
		list.add(new Student1(3,"Rahul",100));
		list.add(new Student1(4,"Sonam",119));
		
		
		List<Integer> marks = list.stream().map((s) ->{
			return s.mark;
		}).collect(Collectors.toList());
		
		System.out.println(marks);
//		System.out.println(list);
		
		
//		Stream<Student1> strm =list.stream();
//		
		
//		for each method
//		strm.forEach((s) -> {
//			System.out.println(s);
//		});
//		
		
//		
//		Stream<Student1> st = strm.map((s) -> {
//			 s.mark = s.mark +1 ;
//			 return s;
//		});
//		not work code 
		
//		
//		Stream<Student1> s1 = strm.filter((s) -> {
//			 return  s.mark > 90;
//			 
//		});
//		

		
		
//		Stream<Student1> s1 = list.stream().filter((s) ->{
//			return s.mark > 90;
//		});
		
		
// map method
		
		Stream<Student1> stream1 = list.stream().map((s) ->{
			s.mark = s.mark +1;
			return s;
		});
		
		stream1.forEach((s)->{
			System.out.println(s);
		});
//		code is working
		
		
//		reduce method
//		Stream<Integer> markStream = list.stream().map((s) ->{
//			return s.mark;
//		});
//		
//		Optional<Integer> marks = markStream.reduce((mark,sum) ->{
//			return mark + sum;
//		});
//		
//		System.out.println(marks.get());
		
		
	}

}
