package Assignments;

public class Employee {
	String name;
	int age;
	double Salary;
	static double totalSalary;
	
	public Employee() {
		totalSalary = totalSalary+Salary;
	}
	private static double getTotalSalary() {
		return totalSalary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		e1.name = "E1";
		e1.age = 20;
		e1.Salary = 10;
		e2.name = "E2";
		e2.age= 21;
		e2.Salary = 12;
		e3.name = "E3";
		e3.age = 22;
		e3.Salary = 13;
		System.out.println("Total Salary is: "+ Employee.getTotalSalary());
	}

}
