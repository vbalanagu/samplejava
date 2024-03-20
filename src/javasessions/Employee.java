package javasessions;

public class Employee {
	String name;
	int age;
	double salary;
	/*
	 * Constructor: Helps in constructing an object of a class
	 * name will same as class name
	 * looks like a function but not a function
	 * does not return anything (not even void)
	 * can be overloaded
	 * will be called whenever an object is created
	 * will help to define instance variables
	 * will help to restrict object creation
	 * this keyword is useful to create instance variables (in the below exmaple, an object creation must pass atlease name)
	 */
	public Employee(String name) {
		this.name = name;
	}
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Tom");
		Employee e2 = new Employee("Harry", 21);
		Employee e3 = new Employee("lisa", 23, 24.5);
		System.out.println(e1.name);
		System.out.println(e2.name);
		System.out.println(e3.name);
		

	}

}
