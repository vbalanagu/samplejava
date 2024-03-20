package javasessions;

public class CallByRef {
	String name;
	int age;

	public static void test() {
		System.out.println("test method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByRef obj1 = new CallByRef();
		obj1.name = "tina";
		obj1.age = 25;
		
		System.out.println(obj1.name+ " and age: "+ obj1.age);
	}

}
