package javasessions;

public class FunctionsInJava {
	
	public void test() {
		System.out.println("Hello world");
	}

	public int getinfo() {
		int a = 10;
		int b = 20;
		return a+b;
		
	}
	public int add(int a, int b) {
		System.out.println("Adding tow numbers");
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		int result = obj.getinfo();
		System.out.println(result);
		int addition = obj.add(5, 6);
		System.out.println(addition);
	}
}
