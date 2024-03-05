package javasessions;

public class ConditionalStatements {
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		if(a>b) {
			System.out.println("a is greaterthan b");
		} else {
			System.out.println("b is greater than a");
		}
		
		if(false) {
			System.out.println("FALSE"); //example of dead code and is not a good practice
		} else {
			System.out.println("TRUE");
		}
		
		boolean flag=true;
		if(flag) {
			System.out.println("TRUE");
		} else {
			System.out.println("FLASE");
		}
	}

}
