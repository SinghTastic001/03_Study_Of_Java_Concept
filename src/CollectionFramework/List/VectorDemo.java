package CollectionFramework.List;


import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<Integer> vt = new Vector<Integer>();
		
		vt.add(1);
		vt.add(10);
		vt.add(500);
		vt.add(1000);
		vt.add(600);
		
		System.out.println("vector "+vt);
		System.out.println("size "+vt.size());
		System.out.println("remove "+vt.remove(1));
		System.out.println("replace "+vt.set(0, 90));
		System.out.println("get "+vt.get(1));
		
		
		
		
		
	
	}
}
