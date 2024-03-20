package javasessions;

public class Customer {
	
	//method overloading is a OOP concept -> Poly(Many)+Morphism(forms): Method overloading is a compile time polymorphism
	//when in the same class, we have methods:
	//1. with same name
	//2. different number of parameters
	//3. different sequence of parameters
	//4. return type doesn't matter
	public void test() {
		System.out.println("This is a test method");
	}
	public void test(int a) {
		System.out.println("This is a test method: "+a);
	}
	public void test(String a) {
		System.out.println("This is a test method with String: "+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer obj = new Customer();
		obj.test();
		obj.test(5);
		obj.test("Hello world");
		
	}

}
