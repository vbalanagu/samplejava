package oopEncapsulation;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer obj = new Customer("tim", 32, 22.45, true);
		System.out.println(obj.getName() + " " + obj.getAge() + " " + obj.getSalary() + " " + obj.isActive());

	}

}
