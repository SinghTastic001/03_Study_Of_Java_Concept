package MultiThreading;

class Resource1{
	
	void printDetails(){
		synchronized(this) {
			for(int i=1; i<10; i++) {
				System.out.println("Resource "+i);
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class TR1 extends Thread{
	
	Resource1 resource;
	public TR1(Resource1 resource) {
		this.resource= resource;
	}
	public void run() {
		resource.printDetails();
	}
}

class TR2 extends Thread{
	
	Resource1 resource;
	public TR2(Resource1 resource) {
		this.resource = resource;
	}
	public void run() {
		
		resource.printDetails();
	}
}
public class SynchronizationClass {

	public static void main(String[] args) {
		
		Resource1 resource = new Resource1();
		
		TR1 t1 = new TR1(resource);
		
		t1.start();
		
		TR2 t2 = new TR2(resource);
		
		t2.start();
		
	}
}
