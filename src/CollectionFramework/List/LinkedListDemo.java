package CollectionFramework.List;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> li = new LinkedList<String>();
		
		li.add("mango");
		li.add("orange");
		li.add("apple");
		li.add("grapes");
		li.add("watermelon");
		li.add("pineapple");
		li.add("lemon");
		li.add("kiwi");
		
		System.out.println(li);
		System.out.println("size "+li.size());
		System.out.println("remove "+li.remove(1));
		System.out.println("replace "+li.set(0, "hiiii"));
		
		for(int i=0; i<li.size(); i++) {
			System.out.println(li.get(i));
		}
	}
}
