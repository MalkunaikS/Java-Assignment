package Assignment;

public class HollowTriangle {

	public static void main(String[] args) {
		int r;
		int px=5;
		int py=5;
		
		for (r = 1; r <= 5; r++) {
            for (int c = 1; c <= 9; c++) {
                if(r==5 || c==px || c==py )
                {
                	System.out.print(" * ");
                }
                else
                {
                	System.out.print("   ");
                }
                	
            }
            px--;
            py++;
            System.out.println();
        }


	}

}
