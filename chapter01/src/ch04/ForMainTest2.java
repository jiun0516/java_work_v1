package ch04;

public class ForMainTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i = 2; i <10; i++) {
//			for(int k = 1; k < 10; k++ ) {
//				System.out.println(i +" * "+  k + " = " + (i * k) );
//			}
//			System.out.println("====================");
//		} // end of for
		
		for(int i = 1; i <=9; i += 2) {
			for(int k = 1; k <= i; k++ ) {
				System.out.print("*");
			}
			System.out.println();
		} // end of for
		
		System.out.println("====================");
		
		for(int i = 1; i <=9; i += 2) {
			for(int k = 9; k >= i; k-- ) {
				System.out.print("*");
			}
			System.out.println();
		} // end of for
		
		System.out.println("====================");
		
		for(int i = 1; i <9; i ++) {
			for(int k = 8; k > i; k-- ) {
				System.out.print("  ");
			}
			for(int k = 0; k < 2 * i -1; k++ ) {
				System.out.print("*");
			}
			System.out.println();
		} // end of for
			
		System.out.println("====================");
		
		for(int i = 1; i <=9; i ++) {
			for(int k = 1; k < i; k++ ) {
				System.out.print("  ");
			}
			for(int k = 16; k > 2 * i -1; k-- ) {
				System.out.print("*");
			}
			System.out.println();
		} // end of for
		
		System.out.println("====================");
		
		
		for(int i = 1; i <9; i ++) {
			for(int k = 8; k > i; k-- ) {
				System.out.print("  ");
			}
			for(int k = 0; k < 2 * i -1; k++ ) {
				System.out.print("*");
			}
			System.out.println();
		} // end of for
		
		for(int i = 1; i <9; i ++) {
			for(int k = 0; k < i; k++ ) {
				System.out.print("  ");
			}
			for(int k = 13; k > 2 * i -2; k-- ) {
				System.out.print("*");
			}
			System.out.println();
		} // end of for

	}

}
