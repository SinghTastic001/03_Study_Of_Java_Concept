package Arrays;

public class MultiDemsional {
	
	public static void main(String[] args) {
		
		String[][] val = {{"sound","simple","singh"},{"car","bike","toy"},{"black","red","orange","yellow"}};
		
		System.out.println(val.length);
		System.out.println(val[1][2]);
		
		for(int i=0; i<val.length; i++) {
			for(int j=0; j<val[i].length; j++) {
				System.out.println(val[i][j]);
			}
		}
		
	}

}
