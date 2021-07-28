package paraumtri_practice;

public class practice_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//   *\  **\ ***\****
		
		for(int i=1; i<5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print("- ");
			
		} for (int k=5; k>5-i; k-- ) {
			System.out.print("*");
		} System.out.println();
		}
	}
}
