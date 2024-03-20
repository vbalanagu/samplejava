package oopEncapsulation;

public class Customer {
	private String name;
	private int age;
	private double Salary;
	private boolean isActive;
	public Customer(String name, int age, double salary, boolean isActive) {
		this.name = name;
		this.age = age;
		Salary = salary;
		this.isActive = isActive;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	

}
