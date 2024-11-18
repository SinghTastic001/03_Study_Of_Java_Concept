package CollectionFramework.List;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();
		
		st.push(1);
		st.push(4);
		st.push(7);
		st.push(10);
		st.push(15);
		st.push(50);
		st.push(100);
		st.push(110);
		
		System.out.println("stact  "+st);
		System.out.println("size "+st.size());
		System.out.println("remove1 "+st.pop());
		System.out.println("remove2 "+st.pop());
		System.out.println("size "+st.size());
		
		for(int i=0; i<st.size(); i++) {
			System.out.println("get stack "+st.get(i));
		}
	}
}
