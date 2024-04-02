package Assignment;

public class Triangle {

	public static void main(String[] args) {
		int space=4; 
		int rows = 5;
	        int num = 1;
	        for (int r = 1; r <= rows; r++) {
	        	for (int i = 1; i <= space; i++) {
	                System.out.print("   ");
	                
	            }
	        	
	            for (int j = 1; j <= num; j++) {
	                System.out.print("  *   ");
	                
	            }
	            System.out.println();
	            space--;
	            num++;
	        }

	}

}
