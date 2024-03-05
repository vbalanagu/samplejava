package javasessions;

public class ANDOROperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean c1 = true;
		boolean c2 = false;
		boolean c3 = true;
		boolean c4 = true;
		
		if(c1&c2&c3&c4 ) { //true&false&true&true => false
			System.out.println("hi");
		} else {
			System.out.println("Bye");
		}
		//&& - Short circuit operator
		if(c1&&c2&&c3&&c4 ) {//true&&false => false
			System.out.println("hi");
		} else {
			System.out.println("Bye");
		}
		
		int a = 500;
		int b = 800;
		int c = 950;
		int d = 759;
		if(a>b && a>c && a>d) {
			System.out.println("a is the great number");
		} else {
			if(b>c && b>d) {
				System.out.println("b is the great number");
			} else {
				if(c>d) {
					System.out.println("c is the greatest number");
				} else {
					System.out.println("d is the greatest number");
				}
			}
		}

	}

}
