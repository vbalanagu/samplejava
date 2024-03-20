package oopEncapsulation;

public class Employee {
	private String name;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	private boolean isActive;
	public void setName(String name) {
			this.name = name;
	}
	public String getName() {
			return this.name;
	}

}
